package org.dreamersweekend.serene;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triag = (Triangle) context.getBean("Triangle");
		triag.draw();
		triag.setType("Scalene");
		triag.draw();
	}

}
