package mycodes;

public class CDcube {

	  public static long findNb(long m) {
		    long mm = 0;
		    long n = 0;
		    while(mm < m){
		      n = n + 1;
		      mm = mm + n*n*n;
		    }
		    if(mm == m){
		      return n;
		    }
		    return -1;
		  }  
	public static void main(String[] args) {
		System.out.println(findNb(24723578342962L));

	}
	
	//n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
}
