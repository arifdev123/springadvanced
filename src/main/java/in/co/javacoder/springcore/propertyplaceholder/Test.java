package in.co.javacoder.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springcore/propertyplaceholder/springconfig.xml");
		
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);

	}

}
