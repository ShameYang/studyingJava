// ԭ��һ����������arr = {1��2��4��5}
// ����һ��ֵΪ3��Ԫ�أ��Ա�������
import java.util.Arrays;
public class InsertElements {
	public static void main(String[] args) {
		// ԭ������
		int[] arr = {1, 2, 4, 5};
		// ����
		int[] arr1 = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr1.length - 1] = 3;
		Arrays.sort(arr1);
		// arrָ��arr1
		arr = arr1;
		// ���arr
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}