// ��ӡ��������
//   *    ��һ�㣺1��* 2���ո�
//  * *   �ڶ��㣺3��* 1���ո�
// *   *  �����㣺5��* 0���ո�
//  * *   ���Ĳ㣺3��* 1���ո�
//   *    ����㣺1��* 2���ո�
public class HollowDiamond{
	public static void main(String[] args) {
		// �ϰ벿��
		for (int i = 1; i <= 3; i++) {
			// �ո�
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
		// �°벿��
		for (int i = 2; i >= 1; i--) {
			// �ո�
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