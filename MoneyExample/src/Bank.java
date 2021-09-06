import java.util.Hashtable;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 5, 2021
 */
public class Bank {
	
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}
	
	int rate(String from, String to) {
		if (from.equals(to)) return 1;
		Integer rate = (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
				
	}
	
	private Hashtable rates = new Hashtable();
	
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to),new Integer(rate));
	}

}
