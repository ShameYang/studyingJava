// ��������
// �����������һ��Ԫ��ʱ����ʾ����
import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �����ʼ��
			int[] arr = {1, 2, 3, 4};
		do {
			// ���������飬��������һ�κ�� arr����
			int[] arrNew = new int[arr.length - 1];
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("===�����������===");
			arr = arrNew;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("����Ҫ���������� y/n");	
			char key = sc.next().charAt(0);
			if(key == 'n') {
				break;
			}
			if(arr.length == 1) {
				System.out.println("Ԫ�ز��㣬��������...");
				break;
			}
		}while(true);
	}
}