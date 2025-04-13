package com.AtmProggraming;
import java.util.Scanner;
public class MainClass {
	 public static void main(String[] args) {
		 AtmOperation obj=new AtmOperation();
	        int atmnumber=12345;
	        int atmpin=123;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enetr the atm number");
	        int atmNumber=sc.nextInt();
	        System.out.println("enter the atm pin");
	        int pin=sc.nextInt();
	        if((atmnumber==atmNumber)&&(atmpin==pin)){
	         while (true) {
	             
	         
	System.out.println("validation Done");
	System.out.println("1.View available amount \n 2. Withdraw Amount \n 3. Deposit Amount\n 4.view MiniSatatement\n 5.exit");
	System.out.println("Please Choice any option");
	int ch=sc.nextInt();
	if(ch==1) {
		obj.viewBalance();
		
	}
	else if(ch==2){
		System.out.println("enter the withderableAmoun");
		double withderableAmount=sc.nextDouble();
		obj.withderableAmount(withderableAmount);
		
		
	}
	else if(ch==3) {
		System.out.println("enter the amount deposit");
		double depositeMoney=sc.nextDouble();
	
		obj.depositeMoney(depositeMoney);
		
	}
	else if(ch==4) {
		obj.viewMiniStatment();
		
	}
	else if(ch==5) {
		System.out.println("collect your atm card");
		System.out.println("thanks using the atm card");
	}
	else {
		System.out.println("please chooise the correct option");
	}
	
	         }
	        }
	        
	else {
		System.out.println("incorrect atm pin");
		System.exit(0);
	}
	         }
	        
	 }
