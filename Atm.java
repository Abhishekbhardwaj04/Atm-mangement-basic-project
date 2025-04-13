package com.AtmProggraming;

public class Atm {
	 private double balance;
	    private  double depositeMoney;
	    private  double withderableAmount;

	//default constructor
	public Atm(){

	}
	//getter setter
	 public double getBalance(){
	    return balance;
	 }

	 public void setBalance(double balance){
	    this.balance=balance;
	 }

	 public double getdepositeMoney(){
	    return depositeMoney;
	 }
	 public void setdepositeMoney(double depositeMoney){
	    this.depositeMoney=depositeMoney;
	 }

	 public double getwithderableAmount(){
	    return withderableAmount;
	 }

	public void setwithderableAmount(double withderableAmount){
	    this.withderableAmount=withderableAmount;
	}

	}

