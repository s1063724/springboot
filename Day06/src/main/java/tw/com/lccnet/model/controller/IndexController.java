package tw.com.lccnet.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Thymeleaf 是一個頁面模板
 * 
 */
@Controller
public class IndexController {

	//"/"代表首頁
	@GetMapping("/index")
//	@PostMapping
//	@PutMapping
//	@DeleteMapping
	public String index() {
		return "index";
	}
}
