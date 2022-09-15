
package com.xdev.rcmigrationexample.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.xdev.rcmigrationexample.domain.Supplier;


/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends JpaDataAccessObject.Default<Supplier, Integer>
{
	public final static SupplierDAO INSTANCE = new SupplierDAO();
	
	public SupplierDAO()
	{
		super(Supplier.class);
	}
}
