/**
 * 
 */
package com.cashless.hackathon.cashbox.common;

import org.springframework.stereotype.Component;

/**
 * @author danie
 * a utility tool for reformatting strings
 *
 */
@Component
public class BaseSearchUtil {
	
	
	
	/**
	 * the base constructor
	 */
    public BaseSearchUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     * used to add a  clause to a where clause
     * @param where - the where clause;
     * @param temp - current clause
     */
	public String addWhereClause(String where, String temp) {
		// TODO Auto-generated method stub
		if (where != null && where.trim().length() > 0)
		{
			where += " AND ";
		}
		where += temp;
		return where;
	}

}
