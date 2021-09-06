
/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 5, 2021
 */
public interface Expression {
	
	Money reduce(Bank bank, String to);
	
	Expression plus(Expression addend);
	
	Expression times(int multiplier);
}
