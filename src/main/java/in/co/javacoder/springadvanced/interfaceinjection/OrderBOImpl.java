package in.co.javacoder.springadvanced.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
	@Autowired
	@Qualifier("dao1")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside order bo implementation class and inside placeorder");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
