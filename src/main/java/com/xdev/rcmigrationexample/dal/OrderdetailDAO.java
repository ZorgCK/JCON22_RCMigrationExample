
package com.xdev.rcmigrationexample.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.xdev.rcmigrationexample.domain.Orderdetail;
import com.xdev.rcmigrationexample.domain.OrderdetailId;


/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JpaDataAccessObject.Default<Orderdetail, OrderdetailId>
{
	public final static OrderdetailDAO INSTANCE = new OrderdetailDAO();
	
	public OrderdetailDAO()
	{
		super(Orderdetail.class);
	}
}
