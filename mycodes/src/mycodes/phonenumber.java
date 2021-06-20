package mycodes;

import java.util.Arrays;

public class phonenumber {

	public static String createPhoneNumber(int[] numbers) {
	   String phone = Arrays.toString(numbers).replaceAll("\\[|\\]|,|\\s", "");
	   StringBuilder sb = new StringBuilder(phone);
	   sb = sb.insert(0, '(');
	   sb = sb.insert(4, ')');
	   sb = sb.insert(5, ' ');
	   sb = sb.insert(9, '-');
	   return sb.toString() ; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] monTableau = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(createPhoneNumber(monTableau));
		
	}

}
