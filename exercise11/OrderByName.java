package exercise11;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		int a;
		if (m1.getFname() == m2.getFname()) {
			a = m1.getLname().compareTo(m2.getLname());
		} else {
			a = m1.getFname().compareTo(m2.getFname());
		}
		return a;

	}

}
