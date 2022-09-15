
package com.xdev.rcmigrationexample.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.xdev.rcmigrationexample.domain.Region;


/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JpaDataAccessObject.Default<Region, Integer>
{
	public final static RegionDAO INSTANCE = new RegionDAO();
	
	public RegionDAO()
	{
		super(Region.class);
	}
}
