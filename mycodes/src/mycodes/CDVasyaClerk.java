package mycodes;

public class CDVasyaClerk {
	
	public static String Tickets(int[] peopleInLine)
	  {
		int sum = 0;
		
	        for (int i = 0; i<peopleInLine.length ;i++)
	        {
	        	
	        	if (peopleInLine[i] == 25 ) sum += peopleInLine[i]; 
	        	else if (peopleInLine[i] ==50)  sum = sum - 25;
	        	else sum = sum - 75;
	        		
	        }
	        System.out.println(sum);
	        
	
	        
	        if (sum >= 0) return "YES" ;
	        return "NO" ;
				
	        
	  }
	
	
	
	
	public static void main(String[] args) {

		int [] tab = {25, 50, 25, 100};
		System.out.println(Tickets(tab));

	}
	
	

}
