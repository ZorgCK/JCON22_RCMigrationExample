
package com.xdev.rcmigrationexample.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.xdev.rcmigrationexample.domain.Customer;


/**
 * Home object for domain model class Customer.
 * 
 * @see Customer
 */
public class CustomerDAO extends JpaDataAccessObject.Default<Customer, String>
{
	public final static CustomerDAO INSTANCE = new CustomerDAO();
	
	public CustomerDAO()
	{
		super(Customer.class);
	}
}
