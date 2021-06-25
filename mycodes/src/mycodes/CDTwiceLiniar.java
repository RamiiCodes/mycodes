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
            int x = u.first();
            System.out.println(x);
            u.add(x * 2 + 1);
            u.add(x * 3 + 1);
            System.out.println(u);
            u.remove(x);
            System.out.println(u);
        }
        //System.out.println(u.size());
        return u.first();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ldb_linear(20);
		System.out.println(ldb_linear(10));

	}

}
