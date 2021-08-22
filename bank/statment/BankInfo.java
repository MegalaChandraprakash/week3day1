package bank.statment;

public class BankInfo {
	public void savings() {
		System.out.println("savings:40000");

	}
public void fixed() {
	System.out.println("fixed money is 60000");

}
private void depoist() {
System.out.println("depoist amout is 100000");

}
	public static void main(String[] args) {
	 AxisBank axe = new AxisBank();
	 BankInfo bank = new BankInfo();
	 axe.depoist();
	 bank.fixed();
	 bank.savings();

	}

}
