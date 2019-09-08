package in.co.javacoder.springadvanced.standalonecollection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"in/co/javacoder/springadvanced/standalonecollection/list/springconfig.xml");
		ProductList pl = (ProductList) context.getBean("productlist");
		System.out.println(pl);
	}
}
