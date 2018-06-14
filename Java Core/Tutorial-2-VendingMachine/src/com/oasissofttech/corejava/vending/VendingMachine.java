package com.oasissofttech.corejava.vending;

import java.util.List;

/**
	* Problem Statement
	* You need to design a Vending Machine which
	* Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
	* Allow user to select products Coke(25), Pepsi(35), Soda(45)
	* Allow user to take refund by canceling the request.
	* Return selected product and remaining change if any
	* Allow reset operation for vending machine supplier.
	* 
	* Solution and Coding
	* *--------------------------*
		My implementation of Java Vending Machine has following classes and interfaces :
		
		VendingMachine
		It defines the public API of vending machine, usually all high-level functionality should go in this class
		
		VendingMachineImpl
		Sample implementation of Vending Machine
		
		VendingMachineFactory
		A Factory class to create different kinds of Vending Machine
		
		Item
		Java Enum to represent Item served by Vending Machine
		
		Inventory
		Java class to represent an Inventory, used for creating case and item inventory inside Vending Machine
		
		Coin
		Another Java Enum to represent Coins supported by Vending Machine
		
		Bucket
		A parameterized class to hold two objects. It's kind of Pair class.
		
		NotFullPaidException
		An Exception thrown by Vending Machine when a user tries to collect an item, without paying the full amount.
		
		NotSufficientChangeException
		Vending Machine throws this exception to indicate that it doesn't have sufficient change to complete this request.
		
		SoldOutExcepiton
		Vending Machine throws this exception if the user request for a product which is sold out.
	* 
	* @author Rasim SEN
	* http://www.oasissofttech.com
	*/
public interface VendingMachine {   
    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange();   
    public void reset();
}