package mycodes;

import java.util.*;


public class CDWords {
	 public static String order(String words) {
		    String [] tab = words.split(" ");
		    Map <Integer,String> sb = new HashMap <>();
		    
		    for (int i =0; i<tab.length;i++)
		    {	int numStr =0;

		    	for (int j = 0; j < tab[i].length(); j++) {
		    		
		            char charCheck =  tab[i].charAt(j);
		            
		            
		            if(Character.isDigit(charCheck)) {
		            	numStr = (int) charCheck ;
		            	sb.put(numStr, tab[i]);		            			                
		            }		            
		        }		    	
		    }
		    Collection <String> getValues = sb.values();
		    String str = getValues.toString().replace("[", "").replace("]", "").replace(",","");
		    return str;
		    
		  }	 

	public static void main(String[] args) {
		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));

	}

}
