package exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {

		Marksheet m = new Marksheet();
		m.setRollNo("1");
		m.setFname("ajay");
		m.setLname("ubey");
		m.setPhy(55);
		m.setChe(66);
		m.setMat(89);

		Marksheet m1 = new Marksheet();
		m1.setRollNo("3");
		m1.setFname("ajay");
		m1.setLname("dubey");
		m1.setPhy(55);
		m1.setChe(66);
		m1.setMat(89);

		Marksheet m2 = new Marksheet();
		m2.setRollNo("6");
		m2.setFname("ajay");
		m2.setLname("gupta");
		m2.setPhy(55);
		m2.setChe(66);
		m2.setMat(89);

		Marksheet m3 = new Marksheet();
		m3.setRollNo("4");
		m3.setFname("ajay");
		m3.setLname("iwari");
		m3.setPhy(55);
		m3.setChe(66);
		m3.setMat(89);

		Marksheet m4 = new Marksheet();
		m4.setRollNo("5");
		m4.setFname("ajay");
		m4.setLname("sharma");
		m4.setPhy(55);
		m4.setChe(66);
		m4.setMat(89);

		Marksheet m5 = new Marksheet();
		m5.setRollNo("2");
		m5.setFname("mohit");
		m5.setLname("katare");
		m5.setPhy(55);
		m5.setChe(66);
		m5.setMat(89);
		

		ArrayList l = new ArrayList();
		l.add(m);
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);

//		System.out.println(l);
		
		Collections.sort(l, new OrderByName());
		
		Iterator<Marksheet> it = l.iterator();
		while (it.hasNext()) {
			Marksheet g = (Marksheet) it.next();
			System.out.println(g.getRollNo()+" "+g.getFname()+" "+g.getLname());
		}
		

	}
}
