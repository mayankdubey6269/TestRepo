
public class ExceptionHan {

	public static void main(String[] args) {
		String s = "java";
		try {
			System.out.println(s.charAt(5));
			System.out.println(s.length());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			

		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.exit(404);

		} finally {
			System.out.println("String is short");
		}
	}
}
