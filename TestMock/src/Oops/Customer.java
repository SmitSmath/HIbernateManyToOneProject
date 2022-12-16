package Oops;

public class Customer implements IciciBank{

	@Override
	public void withdraw() {
		System.out.println("withdraw succesfull");
		
	}

	@Override
	public void deposite() {
		
		System.out.println("amount deposited");
	}

}
