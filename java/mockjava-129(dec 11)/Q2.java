import java.util.*;
class SBI{

	private double balance = 0;

	ArrayList<String> TransactionDetails = new ArrayList<>();

	public synchronized boolean deposite(double amount , String user){
		try{
			if(amount <= 0)
				throw new FundTransferFailureException("Amount should not be Negative or Zero : USER " + user + " AMOUNT " + (amount));
			
			balance += amount;
			
			TransactionDetails.add("  "+ user + "   " + " deposite " + amount + "  " + balance);
			return true;
		}catch(FundTransferFailureException e){
			System.out.println(e.getMessage());
			return false;
		}
	}

	public double getBalance(){
		return balance;
	}


}

class Main{

	public static void main(String[] args) throws Exception{

		SBI acc = new SBI();

		T1 t1 = new T1(acc);
		T2 t2 = new T2(acc);
		T3 t3 = new T3(acc);
		T4 t4 = new T4(acc);
		T5 t5 = new T5(acc);


		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();


		Thread.sleep(100);

		System.out.println();
		System.out.println();
		Iterator itr = acc.TransactionDetails.iterator();
		System.out.printf("%5s %7s %10s %10s\n" , "User" , "Type" , "Amount" , "Balance");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.printf("%20sTotal Balance : %s" , "" , acc.getBalance());
	
		
	}

}

class FundTransferFailureException extends Exception{
	
	public FundTransferFailureException(String s){
		super(s);
	}
}


class T1 extends Thread{
	SBI obj;
	T1(SBI obj){
		this.obj = obj;
	}
	public void run(){
		if(obj.deposite(5000 , "t1")){
			System.out.println("Deposite Success");
		}else{
			System.out.println("Deposite Failed");
		}
	}
}

class T2 extends Thread{
	SBI obj;
	T2(SBI obj){
		this.obj = obj;
	}
	public void run(){
		if(obj.deposite(15000 , "t2")){
			System.out.println("Deposite Success");
		}else{
			System.out.println("Deposite Failed");
		}
	}
}

class T3 extends Thread{
	SBI obj;
	T3(SBI obj){
		this.obj = obj;
	}
	public void run(){

		if(obj.deposite(-5000 , "t3")){
			System.out.println("Deposite Success");
		}else{
			System.out.println("Deposite Failed");
		}
	}
}

class T4 extends Thread{
	SBI obj;
	T4(SBI obj){
		this.obj = obj;
	}
	public void run(){
		if(obj.deposite(0 ,"t4")){
			System.out.println("Deposite Success");
		}else{
			System.out.println("Deposite Failed");
		}
	}
}

class T5 extends Thread{
	SBI obj;
	T5(SBI obj){
		this.obj = obj;
	}
	public void run(){
		if(obj.deposite(5000 , "t5")){
			System.out.println("Deposite Success");
		}else{
			System.out.println("Deposite Failed");
		}
	}
}