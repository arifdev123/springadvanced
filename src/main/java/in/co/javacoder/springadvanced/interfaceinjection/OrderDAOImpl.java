package in.co.javacoder.springadvanced.interfaceinjection;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside createOrder() of OrderDAOImpl class");

	}

}
