package copm.psl.comparable;

import java.util.TreeSet;

public class TreeeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Emp> ts = new TreeSet<Emp>();
		ts.add(new Emp(58, "aakash", "persi"));
		ts.add(new Emp(22, "Amit", "persi"));
		ts.add(new Emp(2, "likey", "amdocs"));
		ts.add(new Emp(598, "tina", " amazon"));
		ts.add(new Emp(74, "Ruby", "persi"));
		ts.add(new Emp(74, "Rubi", "persi"));

		//System.out.println(ts);
		for (Emp emp : ts) {
			System.out.println("eid  :"+emp.getEid());
			System.out.println("e_name :"+emp.getE_name());
			System.out.println("e_company :"+emp.getE_cmpy());
			System.out.println();
		}
	}

}
