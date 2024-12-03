package com.sai;

public class AmexcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Amexcard payment success...."+amount;
	}

}
