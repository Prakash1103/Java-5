package week4day1assignment;

public class Bank extends SBI{

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("Bank balance is 2000");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Maximum loan amount is 50000");
		
	}
	public static void main(String[] args) {
		//first class
		SBI b1=new Bank();
		b1.bankBalance();
		b1.maximumLoanAmount();
		b1.itLoan();
		
	}

	
}
