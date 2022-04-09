// 随机生成10个 1-100的整数存入数组，求出平均值，最大值及最大值下标，并查找是否有8
// 1.random生成1-100随机整数存入数组
// 2.检查数组情况
// 3.求平均值，最大值，查找元素8
public class Exam01 {
	public static void main(String[] args) {
		
		// 定义数组
		int[] arr = new int[10];
		
		// 遍历arr，存放随机数
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 检查数组情况
		System.out.println("===随机数数组情况===");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		// 平均值
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("平均值 = " + sum / 10.0);
		
		// 最大值及其下标
		int max = arr[0]; // 这里假设第一个元素最大
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i + 1] > max) {
				max = arr[i + 1];
				index = i + 1;
			}
		}
		System.out.println("最大值 = " + max + "\t" + "下标 = " + index);

		// 查找是否存在8
		index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 8) {
				index = i;
				System.out.println("存在元素8");
				break;
			}
		}	
		if(index == -1) {
			System.out.println("不存在元素8");
		}
	}
}