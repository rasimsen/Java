package com.oasissofttech.vendingmachine.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasissofttech.vendingmachine.services.VendingMachineService;
import com.oasissofttech.vendingmachine.type.Coin;
import com.oasissofttech.vendingmachine.type.CoinRequest;

@RestController
public class VendingMachineController {
	@Autowired
	private VendingMachineService vendingMachineService;
	
	@RequestMapping("/microservicetest")
	public String getMicroService() {
		return "OK - Vendor Machine is ready to use!!";
	
	}
	
	@RequestMapping(value = "/optimalchange" , method = RequestMethod.POST)
	public @ResponseBody Collection<Coin> getOptimalChange(@RequestBody CoinRequest pence) {
		return vendingMachineService.getOptimalChangeFor(pence.getPence());
	}

	@RequestMapping(value = "/change" , method = RequestMethod.POST)
	public @ResponseBody Collection<Coin> getChange(@RequestBody CoinRequest pence) {
		return vendingMachineService.getChangeFor(pence.getPence());
	}

}
