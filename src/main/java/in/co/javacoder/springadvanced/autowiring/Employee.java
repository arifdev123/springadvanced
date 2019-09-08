package in.co.javacoder.springadvanced.autowiring;

public class Employee {

	private Address address;
	
	Employee(Address address) {
		System.out.println("Employee parameterized constructor !!!");
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Address setter !!!");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
