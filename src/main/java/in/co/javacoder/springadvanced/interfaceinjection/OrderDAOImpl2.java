package in.co.javacoder.springadvanced.interfaceinjection;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("This is second impl of DAO - createOrder().");
	}

}
