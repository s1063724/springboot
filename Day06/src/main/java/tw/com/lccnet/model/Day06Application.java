package tw.com.lccnet.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
/**
 * 自動配置的結構
 * @EnableAutoConfiguration 
 * 
 * 搭配
 * @AutoConfigurationPackage
 * @Import(AutoConfigurationImportSelector.class)
 * 會自動掃描 META-INF/spring.factories
 * 
 * xxxAutoConfiguration 自動設定類
 * @CondtionXXX 都屬於設定檔
 * @CondtionXXX 設定檔
 * @CondtionOnBean 容器中的Bean檔
 *  
 */
@SpringBootApplication
public class Day06Application {

	public static void main(String[] args) {
		SpringApplication.run(Day06Application.class, args);
	}

}
