package com.cashless.hackathon.cashbox.cashBoxUser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


@Service
public class CashBoxUserServiceImpl implements CashBoxUserService {
	@Autowired
	private CashBoxUserRepository cashBoxUserRepository;
	
	//Selects all regions
	@Override
	public List<CashBoxUser> findAll() {
		return cashBoxUserRepository.findAll();
	}

	

	//Create a region
	@Override
	public CashBoxUser save(CashBoxUser branch) {
		return cashBoxUserRepository.save(branch);
	}

	@Override
	public void delete(long id) {
		cashBoxUserRepository.deleteById(id);
	}
	
	@Override
	public CashBoxUser update(CashBoxUser region) {
		return cashBoxUserRepository.save(region);
	}
	
	//Select a region
	@Override
	public CashBoxUser findById(long id) {
		return cashBoxUserRepository.findById(id).orElse(null);
	}

	@Override
	public List<CashBoxUser> queryRegion(CashBoxUser region) {
		return cashBoxUserRepository.findAll(Example.of(region));
	}

}
