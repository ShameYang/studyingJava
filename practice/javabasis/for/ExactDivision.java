// 1-100所有被5整除的数，每五个为一行输出
public class ExactDivision {
	public static void main(String[] args) {
		// 计数
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
				count++;
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}