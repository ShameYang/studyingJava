public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; // ������ά���飬ȷ��һά����
		for (int i = 0; i < arr.length; i++) { // ����arrÿһά����
			// ��ÿ�����鿪�ٿռ䣬�����Ϊnull
			arr[i] = new int[i + 1];
			// ����һά���飬����ÿ��Ԫ�ظ�ֵ
			for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = i + 1;
			}
		}
		// ����arr���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}