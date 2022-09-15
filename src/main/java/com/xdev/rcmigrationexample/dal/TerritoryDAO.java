
package com.xdev.rcmigrationexample.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.xdev.rcmigrationexample.domain.Territory;


/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JpaDataAccessObject.Default<Territory, String>
{
	public final static TerritoryDAO INSTANCE = new TerritoryDAO();
	
	public TerritoryDAO()
	{
		super(Territory.class);
	}
}
