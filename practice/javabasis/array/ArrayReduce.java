// 数组缩减
// 当缩减到最后一个元素时，提示结束
import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数组初始化
			int[] arr = {1, 2, 3, 4};
		do {
			// 创建新数组，拷贝缩减一次后的 arr数组
			int[] arrNew = new int[arr.length - 1];
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("===缩减后的数组===");
			arr = arrNew;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("还需要继续缩减吗？ y/n");	
			char key = sc.next().charAt(0);
			if(key == 'n') {
				break;
			}
			if(arr.length == 1) {
				System.out.println("元素不足，缩减结束...");
				break;
			}
		}while(true);
	}
}