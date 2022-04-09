// 打印空心菱形
//   *    第一层：1个* 2个空格
//  * *   第二层：3个* 1个空格
// *   *  第三层：5个* 0个空格
//  * *   第四层：3个* 1个空格
//   *    第五层：1个* 2个空格
public class HollowDiamond{
	public static void main(String[] args) {
		// 上半部分
		for (int i = 1; i <= 3; i++) {
			// 空格
			for (int j = 1; j <= 3 - i; j++)
				System.out.print(" ");
			// *
			for (int k = 1; k <= 2 * i - 1; k++) {
				if(k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 下半部分
		for (int i = 2; i >= 1; i--) {
			// 空格
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			// *
			for (int k = 1; k <= 2 * i - 1; k++) {
				if(k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}