<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class CDSumDigitPower {
	
    public static List<Long> sumDigPow(long a, long b) {
        final List<Long> res = new ArrayList<>();        
        for (long i = a; i <= b; i++) {
            long v = 0;
            int exp = 1;
            for (char c : (""+i).toCharArray()) { 
              v += Math.pow(c - '0', exp++);
              if (v > i) break;
            }
            if (v == i) res.add(i);
          }
          return res;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigPow(1, 5));

	}

}
=======
import java.util.ArrayList;
import java.util.List;

public class CDSumDigitPower {
	
    public static List<Long> sumDigPow(long a, long b) {
        final List<Long> res = new ArrayList<>();        
        for (long i = a; i <= b; i++) {
            long v = 0;
            int exp = 1;
            for (char c : (""+i).toCharArray()) { 
              v += Math.pow(c - '0', exp++);
              if (v > i) break;
            }
            if (v == i) res.add(i);
          }
          return res;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigPow(1, 5));

	}

}
>>>>>>> bcff13cc9bf670da32a248d79278a618c50e312e
