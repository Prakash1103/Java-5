package week4day1assignment;

public class Bank1 implements CIBIL,PNB{
	
    public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("Cibil score is good ");
		
	}

	public void maximumLoanamount() {
		// TODO Auto-generated method stub
		System.out.println("Maximum loan amount is 50000");
		
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("credit score is good ");
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("Minimum balance is 1000");
		
	}
	public static void main(String[] args) {
		//first interface 
		CIBIL b2=new Bank1();
		b2.cibilScore();
		
		//Second Interface
		PNB b3=new Bank1();
		b3.creditScore();
		b3.maximumLoanamount();
		b3.minimumBalance();
		
		}

}
