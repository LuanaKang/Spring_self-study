package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!!");	//data는 model을 resources/templates/hello.html에 넘김
		return "hello"; // resources/templates/hello.html을 찾아 가라는 것
	}
	
	@GetMapping("hello-mvc")
	public String helloMVC(@RequestParam("name") String name/* 웹에서 parameter를 받음 */, Model model) { /* 데이터 넘겨주기 필수!! */
		model.addAttribute("name", name);
		return "hello-templete";
	}
	
	@GetMapping("hello-string")
	@ResponseBody /* http 바디에 이 데이터를 직접 넣어주겠다! */
	public String helloString(@RequestParam("name") String name) {
		return "hello "+name; 
	}
	
	@GetMapping("hello-api")
	@ResponseBody
	public Hello helloApi(@RequestParam("name") String name) {
		Hello hello = new Hello();
		hello.setName(name);
		return hello; /* {key:value}로 데이터 출력 */
	}
	
	static class Hello{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	}
}
