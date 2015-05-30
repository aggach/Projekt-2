
public class Problem4 {

	public static boolean isPal(int number) {
		String s = new Integer(number).toString();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
	
	public static int greatestPalindrom(int max) {
		int largest = 0;
		int product;

		for (int a = max; a > 0; a--) {
			for (int b = max; b > 0; b--) {
				product = a * b;
				if (isPal(product)) {
					largest = Math.max(largest, product);
				}
			}
		}
		return largest;
	}


	public static void main(String[] args) {
	}
}