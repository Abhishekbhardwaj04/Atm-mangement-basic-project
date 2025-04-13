package com.AtmProggraming;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class AtmOperation implements AtnOperation {
Atm atm=new Atm();
Map<Double,String> miniStatement=new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("available valance"+atm.getBalance());
	}

	@Override
	public void withderableAmount(double withderableAmount) {
		// TODO Auto-generated method stub
		if(withderableAmount<=atm.getBalance()) {
			miniStatement.put(withderableAmount,"withderableAmoun");
		System.out.println("Collect the case"+withderableAmount);
		atm.setBalance(atm.getBalance()-withderableAmount);
		viewBalance();
		
	}
		else {
			System.out.println("insufficient balance");
		}
	}

	@Override
	public void depositeMoney(double depositeMoney) {
		// TODO Auto-generated method stub
		miniStatement.put(depositeMoney,"depositeMoney");
		System.out.println("deposit amount Succesfully"+depositeMoney);
		atm.setBalance(atm.getBalance()+depositeMoney);
		viewBalance();
	}

	@Override
	public void viewMiniStatment() {
		// TODO Auto-generated method stub
		for(Entry<Double,String> m:miniStatement.entrySet()) {
			System.out.println(m.getKey()+""+m.getKey());
			
		}
		
	}

}

