package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!!");	//data는 model을 resources/templates/hello.html에 넘김
		return "hello"; // resources/templates/hello.html을 찾아 가라는 것
	}
}
