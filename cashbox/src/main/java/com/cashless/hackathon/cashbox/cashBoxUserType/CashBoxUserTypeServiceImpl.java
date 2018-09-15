package com.cashless.hackathon.cashbox.cashBoxUserType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


@Service
public class CashBoxUserTypeServiceImpl implements CashBoxUserTypeService {
	@Autowired
	private CashBoxUserTypeRepository cashBoxUserTypeRepository;
	
	//Selects all regions
	@Override
	public List<CashBoxUserType> findAll() {
		return cashBoxUserTypeRepository.findAll();
	}

	

	//Create a region
	@Override
	public CashBoxUserType save(CashBoxUserType branch) {
		return cashBoxUserTypeRepository.save(branch);
	}

	@Override
	public void delete(long id) {
		cashBoxUserTypeRepository.deleteById(id);
	}
	
	@Override
	public CashBoxUserType update(CashBoxUserType region) {
		return cashBoxUserTypeRepository.save(region);
	}
	
	//Select a region
	@Override
	public CashBoxUserType findById(long id) {
		return cashBoxUserTypeRepository.findById(id).orElse(null);
	}

	@Override
	public List<CashBoxUserType> queryRegion(CashBoxUserType region) {
		return cashBoxUserTypeRepository.findAll(Example.of(region));
	}

}
