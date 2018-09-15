package com.cashless.hackathon.cashbox.cashBoxUserType;

import java.util.List;

import com.cashless.hackathon.cashbox.cashBoxUser.CashBoxUser;

public interface CashBoxUserTypeService {
public List<CashBoxUserType> findAll();
	
	
	/**
	 * @param id unique identifier of the require region
	 * 
	 * @return gives the region whose id was provided
	 */
	public CashBoxUserType findById(long id);
	
	
	/**
	 * @param region
	 * @return creates a region
	 */
	
	public CashBoxUserType save(CashBoxUserType region);
	
	public void delete(long id);
	
	public CashBoxUserType update(CashBoxUserType region);

	public List<CashBoxUserType> queryRegion(CashBoxUserType region);
	


}
