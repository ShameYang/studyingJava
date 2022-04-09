// 打印金字塔
//     *      第一层：四个空格
//    ***     第二层：三个空格
//   *****    第三层：两个空格
//  *******   第四层：一个空格
// *********  第五层：零个空格
//
// 思路分析：
//  1.打印矩形(5 * 5)，确定层数
//  2.打印直角三角形，确定*数
//  3.打印每行空格，空格数 = 总层数 - 当前层数
// 先死后活：
//  层数做变量
import java.util.Scanner;

public class Pyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入金字塔的总层数：");
		int layer = sc.nextInt(); // 总层数
		for (int i = 1; i <= layer; i++){ // i表示金字塔层数
			
			for (int k = 1; k <= layer - i; k++){ // k表示每层空格数
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++){ // j表示每层的*数
				System.out.print("*");
			}
			System.out.println();
		}
	}
}