
public class codewarsaccum {
	
	public static String accum(String s) {
	     String result = "";
	     for (int i = 0; i < s.length(); i++) {
	       char currentChar = s.charAt(i);
	       for (int j = 0; j <= i; j++) {
	         if (j == 0) {
	           result += Character.toUpperCase(currentChar);
	         } else {
	           result += Character.toLowerCase(currentChar);
	           System.out.println(result);
	         } 
	       }
	       result += "-";
	       System.out.println(result);
	     }
	     return result.substring(0, result.length()-1);
	    }

}
