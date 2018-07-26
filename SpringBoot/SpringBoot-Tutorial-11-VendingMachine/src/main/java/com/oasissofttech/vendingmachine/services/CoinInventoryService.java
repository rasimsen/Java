package com.oasissofttech.vendingmachine.services;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.oasissofttech.vendingmachine.type.Coin;

public interface CoinInventoryService {
	void updateProperties(ArrayList<Coin> coinsList);

	Coin[] getArrayOfAvailableCoins(BigDecimal pences);
}
