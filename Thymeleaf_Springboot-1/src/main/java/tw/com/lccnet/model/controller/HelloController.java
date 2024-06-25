package tw.com.lccnet.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message","Hello World");
		
		return "helloworld";
	}
	
	@GetMapping("/success") //網頁URL
	public String success(Model model) { //傳入的參數Model
		model.addAttribute("message","成功"); //輸出的內容
		
		return "success"; //網頁頁面success.html
	}
	
	@GetMapping("/strap") //網頁URL
	public String bootstrap(Model model) { //傳入的參數Model
		model.addAttribute("message","   BootStrap"); //輸出的內容
		
		return "bootstrap"; //網頁頁面success.html
	}
}
