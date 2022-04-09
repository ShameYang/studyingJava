// 打印十行杨辉三角
// 1
// 1	1
// 1	2	1
// 1	3	3	1
// 1	4	6	4	1
// n行有n个数，首尾都是1，除首尾外每个数 = 上一行同一列数 + 上一行上一列数
public class YangHui {
	public static void main(String[] args) {
		// 行数确定，列数等于行数
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) { // 遍历二维数组第一维
			// 给每个一维数组（行）开辟空间
			arr[i] = new int[i];
			// 给每个一维数组（行）赋值
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == i - 1) { // 每行首尾都是1
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		// 输出杨辉三角
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}