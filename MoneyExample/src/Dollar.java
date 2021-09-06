

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 5, 2021
 */
public class Dollar extends Money {
	
	
	
	//constructor
	public Dollar(int amount, String currency) {
		super(amount, currency);
	}
	
	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	

	
	
	
	

}
