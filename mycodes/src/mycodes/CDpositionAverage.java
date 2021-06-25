package mycodes;


public class CDpositionAverage {	
	
		  public static double posAverage(String s) {
		    String[] strings = s.split(",");
		    int matchs = 0;
		    double of = 0;
		    for (int i = 0; i < strings.length; i++)
		      strings[i] = strings[i].trim();
		    for (int i = 0; i < strings.length; i++) {
		      for (int j = i + 1; j < strings.length; j++)
		        for (int k = 0; k < strings[i].length(); k++) {
		          matchs += (strings[i].charAt(k) == strings[j].charAt(k)) ? 1 : 0;
		          of++;
		        }
		    }
		    return matchs * 100 / of;
		  }
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(posAverage("6900690040, 4690606946, 9990494604"));
		//System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"));
		//System.out.println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096"));
		//test("466960, 069060, 494940, 060069, 060090");
	}

}
/*Given string s = "444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490" 
 * composing a set of n = 10 substrings (hence 45 combinations), pos_average returns 29.2592592593
 * 
 * s1 = "6900690040"
s2 = "4690606946"
s3 = "9990494604"

 * Given n substrings (n >= 2) in a string s our
 *  function pos_average will calculate the average percentage of positions
 *   that are the same between the (n * (n-1)) / 2 sets of substrings taken 
 *   amongst the given n substrings. It can happen that some substrings are 
 *   duplicate but since their ranks are not the same in s they are considered 
 *   as different substring
 */