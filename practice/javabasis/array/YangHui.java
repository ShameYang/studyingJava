// ��ӡʮ���������
// 1
// 1	1
// 1	2	1
// 1	3	3	1
// 1	4	6	4	1
// n����n��������β����1������β��ÿ���� = ��һ��ͬһ���� + ��һ����һ����
public class YangHui {
	public static void main(String[] args) {
		// ����ȷ����������������
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) { // ������ά�����һά
			// ��ÿ��һά���飨�У����ٿռ�
			arr[i] = new int[i];
			// ��ÿ��һά���飨�У���ֵ
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == i - 1) { // ÿ����β����1
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		// ����������
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}