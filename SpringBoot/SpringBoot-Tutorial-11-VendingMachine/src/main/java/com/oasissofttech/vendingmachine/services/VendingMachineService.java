package com.oasissofttech.vendingmachine.services;

import java.util.Collection;

import com.oasissofttech.vendingmachine.type.Coin;

public interface VendingMachineService {
	public Collection<Coin> getOptimalChangeFor(int pence);

	public Collection<Coin> getChangeFor(int pence);
}
