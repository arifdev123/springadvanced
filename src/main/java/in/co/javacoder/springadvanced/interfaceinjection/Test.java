package in.co.javacoder.springadvanced.interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springadvanced/interfaceinjection/springconfig2.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();
	}

}
