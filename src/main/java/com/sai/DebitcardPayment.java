package com.sai;

public class DebitcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return"Deditcard payment success...."+amount;
	}

}
