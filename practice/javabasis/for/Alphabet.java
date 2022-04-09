// Êä³ö a-z Z-A
public class Alphabet {
	public static void main(String[] args) {
		for (char a = 'a'; a <= 'z'; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (char a = 'Z'; a >= 'A'; a--) {
			System.out.print(a + " ");
		}
	}
}