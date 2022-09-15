
package com.xdev.rcmigrationexample.dal;

import com.xdev.rcmigrationexample.domain.Category;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends JpaDataAccessObject.Default<Category, Integer>
{
	public final static CategoryDAO INSTANCE = new CategoryDAO();
	
	public CategoryDAO()
	{
		super(Category.class);
	}
}
