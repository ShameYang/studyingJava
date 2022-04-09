// 打印空心金字塔
//     *     第一层：一个* 开头三个空格
//    * *    第二层：两个* 开头两个空格 中间一个空格
//   *   *   第三层：两个* 开头一个空格 中间三个空格
//  *******  第四层：七个* 开头零个空格
// 思路分析:
//  先打印实心，再掏空
//  1.层数
//  2.每层开头空格数 = 总层数 - 当前层数
//  3.除第一层和最后一层外，当前层第一位和最后一位打印*，其他打印空格
public class HollowPyramid{
	public static void public static void main(String[] args) {
		for (int i = 1; i <= 4; i++){ // i表示层数
			
			for (int k = 1; k <= 4 - i; k++){ // k表示每层开头空格数
				System.out.print(" ");
			}
			
			// 控制每层打印*数
			for (int j = 1; j <= 2 * i - 1; j++){
				
				// 只有第一位和最后一位打印*,最后一层全部打印*
				if (j == 1 || j == 2 * i - 1 || i == 4){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
			// 每层打印完后换行	
			System.out.println();	
			}
		}
	}
}