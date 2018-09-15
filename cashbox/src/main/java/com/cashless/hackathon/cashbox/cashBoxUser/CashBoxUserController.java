package com.cashless.hackathon.cashbox.cashBoxUser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CashBoxUserController {
	@Autowired
	private CashBoxUserService cashBoxUserService;
	
	//Create a Region
	@PostMapping("/cashBoxUser")
	public void createRegion(@RequestBody CashBoxUser region) {
		cashBoxUserService.save(region);	
	}
	
	//Select all Regions
	@GetMapping("/cashBoxUsers")
	public List<CashBoxUser> getRegions() {
		return cashBoxUserService.findAll();
	}
	
	//Delete a region
	@DeleteMapping("/cashBoxUser/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		cashBoxUserService.delete(id);
		// return "redirect:/api/branches";
	}

	//update a region
	@PutMapping("/cashBoxUser")
	public CashBoxUser update(@RequestBody CashBoxUser region) {
		return cashBoxUserService.update(region);
	}
	// Select a currency api
		@GetMapping("/cashBoxUser/{id}")
		public CashBoxUser getAccount(@PathVariable(value = "id") Long id) {

			return cashBoxUserService.findById(id);
		}


	@PostMapping("/search/cashBoxUser")
	public List<CashBoxUser> find(@RequestBody CashBoxUser region) {
		return cashBoxUserService.queryRegion(region);
	}


}
