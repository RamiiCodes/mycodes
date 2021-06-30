/*Write a function that will return the count of distinct case-insensitive
 *  alphabetic characters and numeric digits that occur more than once in the input string. 
 *  The input string can be assumed to contain only alphabets (both uppercase and lowercase) 
 *  and numeric digits. */

package mycodes;
public class CDCountDuplicates {
	
	public static long digPow (int n , int p )
	
	{
		int sum = 0 ;
		String[] str = String.valueOf(n).split("");		
		for (int i = 0; i < str.length ; i++) 
		{ 				
			sum += Math.pow(Double.parseDouble(str[i]), (p + i));						
		}		
		return sum % n == 0 ? sum / n : -1 ;		
    }
			

		public static void main(String[] args) {
			System.out.println(digPow(46288, 3));
			
		}


}
