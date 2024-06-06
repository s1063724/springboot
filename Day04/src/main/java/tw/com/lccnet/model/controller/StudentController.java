package tw.com.lccnet.model.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTAPI 的方式
@RestController
public class StudentController {

	@RequestMapping("/student")
	public String student() {
		return "我是一個學生";
	}
	
}
