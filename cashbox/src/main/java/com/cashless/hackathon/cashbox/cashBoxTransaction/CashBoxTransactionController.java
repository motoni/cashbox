package com.cashless.hackathon.cashbox.cashBoxTransaction;

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

import com.cashless.hackathon.cashbox.common.BaseErrorUtil;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CashBoxTransactionController {
	
	@Autowired
	private CashBoxTransactionService cashBoxTransactionService;
	@Autowired
	private BaseErrorUtil baseErrorUtil;
	//Create a Region
	@PostMapping("/cashBoxTransaction")
	public ResponseEntity<?> create(@Valid @RequestBody CashBoxTransaction cashBoxTransaction,
			BindingResult result) {
		try {

			if (result.hasErrors()) {

				return new ResponseEntity<Map<String, String>>(baseErrorUtil.getBaseErrorUtil(result),
						HttpStatus.BAD_REQUEST);
			} else {
				
				CashBoxTransaction cbt = cashBoxTransactionService.save(cashBoxTransaction);
				
				return new ResponseEntity<CashBoxTransaction>(cbt, HttpStatus.OK);

			}
		} catch (Exception ex) {
			return new ResponseEntity<CashBoxTransaction>(HttpStatus.BAD_REQUEST);
		}
	}
	
	//Select all Regions
	@GetMapping("/cashBoxTransactions")
	public List<CashBoxTransaction> getRegions() {
		return cashBoxTransactionService.findAll();
	}
	
	//Delete a region
	@DeleteMapping("/cashBoxTransaction/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		cashBoxTransactionService.delete(id);
		// return "redirect:/api/branches";
	}

	//update a region
	@PutMapping("/cashBoxTransaction")
	public CashBoxTransaction update(@RequestBody CashBoxTransaction cashBoxTransaction) {
		return cashBoxTransactionService.update(cashBoxTransaction);
	}
	// Select a currency api
		@GetMapping("/cashBoxTransaction/{id}")
		public CashBoxTransaction getAccount(@PathVariable(value = "id") Long id) {

			return cashBoxTransactionService.findById(id);
		}


	@PostMapping("/search/cashBoxTransaction")
	public List<CashBoxTransaction> find(@RequestBody CashBoxTransaction cashBoxTransaction) {
		return cashBoxTransactionService.queryRegion(cashBoxTransaction);
	}

	

}
