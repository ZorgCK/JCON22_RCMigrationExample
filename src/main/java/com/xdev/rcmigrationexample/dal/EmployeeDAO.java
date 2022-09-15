
package com.xdev.rcmigrationexample.dal;

import com.xdev.rcmigrationexample.domain.Employee;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Employee.
 * 
 * @see Employee
 */
public class EmployeeDAO extends JpaDataAccessObject.Default<Employee, Integer>
{
	public final static EmployeeDAO INSTANCE = new EmployeeDAO();
	
	public EmployeeDAO()
	{
		super(Employee.class);
	}
}
