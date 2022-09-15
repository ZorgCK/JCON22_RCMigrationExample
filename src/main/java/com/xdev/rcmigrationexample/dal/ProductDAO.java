
package com.xdev.rcmigrationexample.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.xdev.rcmigrationexample.domain.Product;


/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JpaDataAccessObject.Default<Product, Integer>
{
	public final static ProductDAO INSTANCE = new ProductDAO();
	
	public ProductDAO()
	{
		super(Product.class);
	}
}
