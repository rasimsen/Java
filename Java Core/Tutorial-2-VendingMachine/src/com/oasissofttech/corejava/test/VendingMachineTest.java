package com.oasissofttech.corejava.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.oasissofttech.corejava.vending.Bucket;
import com.oasissofttech.corejava.vending.Coin;
import com.oasissofttech.corejava.vending.Item;
import com.oasissofttech.corejava.vending.NotSufficientChangeException;
import com.oasissofttech.corejava.vending.SoldOutException;
import com.oasissofttech.corejava.vending.VendingMachine;
import com.oasissofttech.corejava.vending.VendingMachineFactory;
import com.oasissofttech.corejava.vending.VendingMachineImpl;

class VendingMachineTest {
	private static VendingMachine vm;

	@BeforeClass
	public static void setUp() {
		vm = VendingMachineFactory.createVendingMachine();
	}

	@AfterClass
	public static void tearDown() {
		vm = null;
	}

	@Test
	public void testBuyItemWithExactPrice() {
		if (vm == null) {
			vm = VendingMachineFactory.createVendingMachine();
		}
		// select item, price in cents
		long price = vm.selectItemAndGetPrice(Item.COKE);
		// price should be Coke's price
		assertEquals(Item.COKE.getPrice(), price);

		// 25 cents paid
		vm.insertCoin(Coin.QUARTER);

		Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange();
		Item item = bucket.getFirst();
		List<Coin> change = bucket.getSecond();

		// should be COKE
		assertEquals(Item.COKE, item);

		// there should not be any change
		//assertTrue(change.isEmpty());
	}

	@Test
	public void testRefund() {
		long price = vm.selectItemAndGetPrice(Item.PEPSI);
		assertEquals(Item.PEPSI.getPrice(), price);
		vm.insertCoin(Coin.DIME);
		vm.insertCoin(Coin.NICKLE);
		vm.insertCoin(Coin.PENNY);
		vm.insertCoin(Coin.QUARTER);

		assertEquals(41, getTotal(vm.refund()));
	}

	@Test // (expected = SoldOutException.class)
	public void testSoldOut() {
		Assertions.assertThrows(SoldOutException.class, () -> {
			for (int i = 0; i < 5; i++) {
				vm.selectItemAndGetPrice(Item.COKE);
				vm.insertCoin(Coin.QUARTER);
				vm.collectItemAndChange();
			}
		});

	}

	@Test // (expected=NotSufficientChangeException.class)
	public void testNotSufficientChangeException() {
		if (vm == null) {
			vm = VendingMachineFactory.createVendingMachine();
		}
		Assertions.assertThrows(NotSufficientChangeException.class, () -> {
			for (int i = 0; i < 5; i++) {
				vm.selectItemAndGetPrice(Item.SODA);
				vm.insertCoin(Coin.QUARTER);
				vm.insertCoin(Coin.QUARTER);
				vm.collectItemAndChange();

				vm.selectItemAndGetPrice(Item.PEPSI);
				vm.insertCoin(Coin.QUARTER);
				vm.insertCoin(Coin.QUARTER);
				vm.collectItemAndChange();
			}
		});
	}

	@Test // (expected=SoldOutException.class)
	public void testReset() {
		Assertions.assertThrows(SoldOutException.class, () -> {
			VendingMachine vmachine = VendingMachineFactory.createVendingMachine();
			vmachine.reset();

			vmachine.selectItemAndGetPrice(Item.COKE);
		});
	}

	@Ignore
	public void testVendingMachineImpl() {
		VendingMachineImpl vm = new VendingMachineImpl();
	}

	private long getTotal(List<Coin> change) {
		long total = 0;
		for (Coin c : change) {
			total = total + c.getDenomination();
		}
		return total;
	}

}
