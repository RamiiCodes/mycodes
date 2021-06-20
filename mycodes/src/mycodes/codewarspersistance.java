
public class codewarspersistance {
	 public static int findIt(int[] a) {
	        int i;
	        for (i = 0; i < a.length; i++) {
	            int count = 0;
	            for (int j = 0; j < a.length; j++) {
	                if (a[i] == a[j])
	                    count++;
	            }
	            if (count % 2 != 0)
	                return a[i];
	        }
	        return -1;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
