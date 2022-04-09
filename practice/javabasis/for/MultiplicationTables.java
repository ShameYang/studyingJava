// 九九乘法表
// 1 * 1 = 1
// 1 * 2 = 2  2 * 2 = 4
// 内层 * 外层 = 结果
public class MultiplicationTables{
	public static void main(String[] args){
		for (int i = 1; i <= 9; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}