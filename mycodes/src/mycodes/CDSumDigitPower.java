package mycodes;
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




}

