package in.co.javacoder.springadvanced.autowiring.annotations.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"in/co/javacoder/springadvanced/autowiring/annotations/stereotype/springconfig.xml");
		InstructorUdemy ins1 = (InstructorUdemy) context.getBean("inst");
		System.out.println(ins1);
		
		InstructorUdemy ins2 = (InstructorUdemy) context.getBean("inst");
		System.out.println(ins2);
	}
}
