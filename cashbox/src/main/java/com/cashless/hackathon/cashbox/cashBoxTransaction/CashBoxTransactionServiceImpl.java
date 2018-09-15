package com.cashless.hackathon.cashbox.cashBoxTransaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.cashless.hackathon.cashbox.cashBoxUser.CashBoxUser;
import com.cashless.hackathon.cashbox.cashBoxUser.CashBoxUserRepository;

@Service
public class CashBoxTransactionServiceImpl implements CashBoxTransactionService {
	@Autowired
	private CashBoxTransactionRepository cashBoxTransactionRepository;
	
	//Selects all regions
	@Override
	public List<CashBoxTransaction> findAll() {
		return cashBoxTransactionRepository.findAll();
	}

	

	//Create a region
	@Override
	public CashBoxTransaction save(CashBoxTransaction cashBoxTransaction) {
		return cashBoxTransactionRepository.save(cashBoxTransaction);
	}

	@Override
	public void delete(long id) {
		cashBoxTransactionRepository.deleteById(id);
	}
	
	@Override
	public CashBoxTransaction update(CashBoxTransaction cashBoxTransaction) {
		return cashBoxTransactionRepository.save(cashBoxTransaction);
	}
	
	//Select a region
	@Override
	public CashBoxTransaction findById(long id) {
		return cashBoxTransactionRepository.findById(id).orElse(null);
	}

	@Override
	public List<CashBoxTransaction> queryRegion(CashBoxTransaction cashBoxTransaction) {
		return cashBoxTransactionRepository.findAll(Example.of(cashBoxTransaction));
	}


}
