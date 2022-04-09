public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; // 创建二维数组，确定一维个数
		for (int i = 0; i < arr.length; i++) { // 遍历arr每一维数组
			// 给每个数组开辟空间，否则均为null
			arr[i] = new int[i + 1];
			// 遍历一维数组，并给每个元素赋值
			for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = i + 1;
			}
		}
		// 遍历arr输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}