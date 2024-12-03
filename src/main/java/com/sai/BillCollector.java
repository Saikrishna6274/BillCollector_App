package com.sai;

public class BillCollector {
	IPayment payment;
	public BillCollector()
	{
		System.out.println("setter injection is implemented ");
	}
	public BillCollector(IPayment payment) {
		this.payment=payment;
		System.out.println("constructer injection in implented");
	}
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	public void billPayment(double amount) {
		String status=payment.pay(amount);
		System.out.println(status);
	}
}
