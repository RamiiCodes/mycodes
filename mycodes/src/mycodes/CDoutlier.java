package mycodes;

public class CDoutlier {
	
	public static int find (int [] integers)
	{
		int oddnum =0;
		int evennum =0;
		int odd =0 ; 
		int even = 0 ; 

		for (int i =0; i<integers.length;i++)
		{
			if (integers[i] % 2 == 0 ) {even ++ ; evennum = integers[i]; } 
			if (integers[i] % 2 != 0 ) {odd ++ ; oddnum = integers[i] ;}			
		}
		
		if ( odd == 1 ) return oddnum ;
		else return evennum ; 		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] exampleTest1 = {Integer.MAX_VALUE, 0, 1}; 
		System.out.println(find(exampleTest1));
	}

}
