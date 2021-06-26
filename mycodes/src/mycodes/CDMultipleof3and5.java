package mycodes;

import java.util.stream.IntStream;

public class CDMultipleof3and5 {
	public int solution (int number) {
		return IntStream.range(1, number).filter(n -> n%3 ==0 || n % 5 ==0).sum();
	  }
/*IntStream range(int startInclusive, int endExclusive) returns a sequential ordered IntStream 
 * from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.
 * *****************************************************************************************
 * The filter() method is an intermediate operation of the Stream interface that allows us
 *  to filter elements of a stream that match a given Predicate
 *  in java 8 , we can add lambda expression into filter parameters */

}
