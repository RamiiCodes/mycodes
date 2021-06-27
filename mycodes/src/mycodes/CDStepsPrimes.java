package mycodes;

public class CDStepsPrimes {

	public static long[] step(int g, long m, long n) {
				
       for (long i = m; i<=n-g;i++)
       {    	  
    	    if (isPrime(i) && isPrime(i+g)) return new long [] {i,i+g};    	    
       }                   
       return null;
    }
	
	public static boolean isPrime (long num)
	{
		 for (int i=2; i <= num/2; i++) if (num%i==0) return false;
		 return true ; 
	}

	
}
