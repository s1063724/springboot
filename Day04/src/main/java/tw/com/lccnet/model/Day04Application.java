package tw.com.lccnet.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication 來標註一個主要程式，說明為spring boot應用
 */
@SpringBootApplication
public class Day04Application {

	public static void main(String[] args) {
		//Spring應用啟動
		SpringApplication.run(Day04Application.class, args);
	}
	
	/*
	 * /Day04/src/main/resources
	 * 1.static放js、css、images等靜態內容
	 * 2.templates放置頁面如html或thymeleaf模板，不能使用jsp
	 * 		如過要使用jsp需要進行其他設定
	 * 3.application.properties設定檔，可以修改一些預設設定
	 * 
	 * 
	 * 配置檔的方式
	 * 	application.properties [預設]
	 *  application.yml
	 * 
	 */

}
