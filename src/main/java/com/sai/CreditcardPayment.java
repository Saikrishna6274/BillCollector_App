package com.sai;

public class CreditcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Creditcard payment success...."+amount;
	}

}