package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!!");	//data�� model�� resources/templates/hello.html�� �ѱ�
		return "hello"; // resources/templates/hello.html�� ã�� ����� ��
	}
	
	@GetMapping("hello-mvc")
	public String helloMVC(@RequestParam("name") String name, Model model) { /* ������ �Ѱ��ֱ� �ʼ�!! */
		model.addAttribute("name", name);
		return "hello-templete";
	}
}
