package mycodes;

import java.util.SortedSet;
import java.util.TreeSet;

public class CDTwiceLiniar {
	public static int ldb_linear(int n)
	{
		if (n == 0) return 1;
        SortedSet<Integer> u = new TreeSet<>();
        u.add(1);
        for (int i = 0; i < n; i++) {
            int getfirst = u.first();
            u.add(getfirst * 2 + 1);
            u.add(getfirst * 3 + 1);
            u.remove(getfirst);
           
        }
        return u.first();
	}

	public static void main(String[] args) {

		System.out.println(ldb_linear(10));

	}

}
