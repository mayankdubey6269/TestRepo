
public class CallingCons {
	public String fname;
	public String lname;
	public String add;
	
	public CallingCons() {
		System.out.println("param 1");
	}
	public CallingCons(String fn,String ln ) {
		System.out.println(fn +" " + ln);
	}
	public CallingCons(String fn, String ln, String add) {
		this(fn,ln);
		System.out.println(fn+ln+ " " +add);
	}
	public static void main(String[] args) {
		CallingCons s = new CallingCons("gagan", "sunhare", "indore");
	}
}
