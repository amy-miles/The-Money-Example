

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 5, 2021
 */
public class Franc extends Money{
	
	

	//constructor
	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	
	
	
	

}

