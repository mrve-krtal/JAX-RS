package _04.exception.mapper;

import _03.exception.Customer;

public class CustomerService {

	public Customer findCustomer(int id) {
		
		if (id==1) {
			return new Customer(1, "best staff");
		}
		return null;
	}

}
