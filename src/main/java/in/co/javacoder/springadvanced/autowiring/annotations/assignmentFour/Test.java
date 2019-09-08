package in.co.javacoder.springadvanced.autowiring.annotations.assignmentFour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"in/co/javacoder/springadvanced/autowiring/annotations/assignmentFour/springconfig.xml");
		Customer cus = (Customer) context.getBean("customer");
		System.out.println(cus);

	}

}
