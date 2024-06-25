package tw.com.lccnet.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody //回應至網頁，網頁內容
	@RequestMapping("/index")  //網址名稱
	public String home() {
		return "Home Page";
	}
}
