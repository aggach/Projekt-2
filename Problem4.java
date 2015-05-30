
public class Problem4 {

	public static boolean isPal(int number) {
		String s = new Integer(number).toString();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
	}
}