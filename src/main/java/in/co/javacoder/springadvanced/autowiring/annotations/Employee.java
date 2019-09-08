package in.co.javacoder.springadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired(required=false)
	@Qualifier("address123")
	private Address address;
	
	
	/*
	 * Employee(Address address) {
	 * System.out.println("Employee parameterized constructor !!!"); this.address =
	 * address; }
	 */
	
	public Address getAddress() {
		return address;
	}
	
	
	/*
	 * public void setAddress(Address address) {
	 * System.out.println("Address setter !!!"); this.address = address; }
	 */

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
