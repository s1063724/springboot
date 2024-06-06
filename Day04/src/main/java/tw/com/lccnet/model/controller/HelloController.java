package tw.com.lccnet.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 * 控制層
 */
@Controller
public class HelloController {
	@ResponseBody //回應至網頁，網頁內容
	@RequestMapping("/hello")  //網址名稱
	public String hello() {
		return "Hello world";
	}
}
