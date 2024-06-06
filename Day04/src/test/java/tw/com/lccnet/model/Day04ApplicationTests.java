package tw.com.lccnet.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tw.com.lccnet.model.bean.Person;

@SpringBootTest
class Day04ApplicationTests {
	@Autowired
	Person person;
	
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
