package com.cashless.hackathon.cashbox.cashBoxUser;

import java.util.List;



public interface CashBoxUserService {
	public List<CashBoxUser> findAll();
	
	
	/**
	 * @param id unique identifier of the require region
	 * 
	 * @return gives the region whose id was provided
	 */
	public CashBoxUser findById(long id);
	
	
	/**
	 * @param region
	 * @return creates a region
	 */
	
	public CashBoxUser save(CashBoxUser region);
	
	public void delete(long id);
	
	public CashBoxUser update(CashBoxUser region);

	public List<CashBoxUser> queryRegion(CashBoxUser region);
	

}
