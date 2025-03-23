package CaseStudy2;

public class Account {
	private long accNumber = 12345678l;
	private double balance = setAccBalance(getBalancer());
	private String name = "Kanishka Malik";

	// getter
	public long getAccNumber() {
		return this.accNumber;

	}

	public double getBalancer() {
		return this.balance;

	}

	public String getAccName() {
		return this.name;

	}

	// setter
	public void setAccName(String name) {
		this.name = name;

	}

	public double setAccBalance(double balance) {

		return this.balance = balance;

	}

	// depositeMethod
	public double depositeAcc(double amount) {
		
		double newBlaance=getBalancer() + amount;
		return setAccBalance(newBlaance);

	}

	// withdrawMethod
	public double withdrawAcc(double amount) {
		
		double newBlaance=getBalancer() - amount;
		return setAccBalance(newBlaance);
	}

}
