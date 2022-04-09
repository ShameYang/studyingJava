// 原有一个升序数组arr = {1，2，4，5}
// 插入一个值为3的元素，仍保持升序
import java.util.Arrays;
public class InsertElements {
	public static void main(String[] args) {
		// 原有数组
		int[] arr = {1, 2, 4, 5};
		// 扩容
		int[] arr1 = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr1.length - 1] = 3;
		Arrays.sort(arr1);
		// arr指向arr1
		arr = arr1;
		// 输出arr
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}