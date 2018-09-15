package com.cashless.hackathon.cashbox.cashBoxTransaction;

import java.util.List;

import com.cashless.hackathon.cashbox.cashBoxUser.CashBoxUser;

public interface CashBoxTransactionService {
public List<CashBoxTransaction> findAll();
	
	
	/**
	 * @param id unique identifier of the require region
	 * 
	 * @return gives the region whose id was provided
	 */
	public CashBoxTransaction findById(long id);
	
	
	/**
	 * @param region
	 * @return creates a region
	 */
	
	public CashBoxTransaction save(CashBoxTransaction cashBoxTransaction);
	
	public void delete(long id);
	
	public CashBoxTransaction update(CashBoxTransaction cashBoxTransaction);

	public List<CashBoxTransaction> queryRegion(CashBoxTransaction cashBoxTransaction);
	


}
