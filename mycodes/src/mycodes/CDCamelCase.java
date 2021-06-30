/*
 * Complete the method/function so that it converts dash/underscore delimited
 *  words into camel casing. The first word within the output should be capitalized
 *   only if the original word was capitalized (known as Upper Camel Case, 
 *   also often referred to as Pascal case).
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
      "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

 */

package mycodes;

import java.util.Arrays;
import java.util.stream.Collectors;


public class CDCamelCase {

	static String toCamelCase(String s){
		
		String [] str = s.split("[-_]");
		char [] ch = new char [str.length];
		String mer = str[0];
		for (int i=1;i<str.length;i++)			
		{			
			ch[i] = Character.toUpperCase(str[i].charAt(0));
			mer = mer  + ch[i] + str[i].substring(1, str[i].length());				
		}
		String[] strArray = new String[] {mer};
		return Arrays.stream(strArray).filter(e -> !"".equals(e)).collect(Collectors.joining(""));		
	}
	public static void main(String[] args) {	
		
		System.out.println(toCamelCase("the_Stealth_Warrior"));
	
	}

}
