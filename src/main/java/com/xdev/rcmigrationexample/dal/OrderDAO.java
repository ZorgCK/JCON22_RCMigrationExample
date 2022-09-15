
package com.xdev.rcmigrationexample.dal;

import com.xdev.rcmigrationexample.domain.Order;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Order.
 * 
 * @see Order
 */
public class OrderDAO extends JpaDataAccessObject.Default<Order, Integer>
{
	public final static OrderDAO INSTANCE = new OrderDAO();
	
	public OrderDAO()
	{
		super(Order.class);
	}
}
