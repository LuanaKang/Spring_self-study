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
		model.addAttribute("data", "hello!!!");	//data�� model�� resources/templates/hello.html�� �ѱ�
		return "hello"; // resources/templates/hello.html�� ã�� ����� ��
	}
	
	@GetMapping("hello-mvc")
	public String helloMVC(@RequestParam("name") String name/* ������ parameter�� ���� */, Model model) { /* ������ �Ѱ��ֱ� �ʼ�!! */
		model.addAttribute("name", name);
		return "hello-templete";
	}
	
	@GetMapping("hello-string")
	@ResponseBody /* http �ٵ� �� �����͸� ���� �־��ְڴ�! */
	public String helloString(@RequestParam("name") String name) {
		return "hello "+name; 
	}
	
	@GetMapping("hello-api")
	@ResponseBody
	public Hello helloApi(@RequestParam("name") String name) {
		Hello hello = new Hello();
		hello.setName(name);
		return hello; /* {key:value}�� ������ ��� */
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
