package com.cashless.hackathon.cashbox.cashBoxUserType;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashless.hackathon.cashbox.cashBoxTransaction.CashBoxTransaction;
import com.cashless.hackathon.cashbox.cashBoxTransaction.CashBoxTransactionService;
import com.cashless.hackathon.cashbox.cashBoxUser.CashBoxUser;
import com.cashless.hackathon.cashbox.common.BaseErrorUtil;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CashBoxUserTypeController {
	@Autowired
	private CashBoxUserTypeService cashBoxUserTypeService;
	@Autowired
	private BaseErrorUtil baseErrorUtil;
	//Create a Region
	@PostMapping("/cashBoxUserType")

	public void createRegion(@RequestBody CashBoxUserType cashBoxUserType) {
		cashBoxUserTypeService.save(cashBoxUserType);	
	}
	//Select all Regions
	@GetMapping("/cashBoxUserTypes")
	public List<CashBoxUserType> getRegions() {
		return cashBoxUserTypeService.findAll();
	}
	
	//Delete a region
	@DeleteMapping("/cashBoxUserType/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		cashBoxUserTypeService.delete(id);
		// return "redirect:/api/branches";
	}

	//update a region
	@PutMapping("/cashBoxUserType")
	public CashBoxUserType update(@RequestBody CashBoxUserType cashBoxTransaction) {
		return cashBoxUserTypeService.update(cashBoxTransaction);
	}
	// Select a currency api
		@GetMapping("/cashBoxUserType/{id}")
		public CashBoxUserType getAccount(@PathVariable(value = "id") Long id) {

			return cashBoxUserTypeService.findById(id);
		}


	@PostMapping("/search/cashBoxUserType")
	public List<CashBoxUserType> find(@RequestBody CashBoxUserType cashBoxTransaction) {
		return cashBoxUserTypeService.queryRegion(cashBoxTransaction);
	}

	

}
