// �������10�� 1-100�������������飬���ƽ��ֵ�����ֵ�����ֵ�±꣬�������Ƿ���8
// 1.random����1-100���������������
// 2.����������
// 3.��ƽ��ֵ�����ֵ������Ԫ��8
public class Exam01 {
	public static void main(String[] args) {
		
		// ��������
		int[] arr = new int[10];
		
		// ����arr����������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// ����������
		System.out.println("===������������===");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		// ƽ��ֵ
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("ƽ��ֵ = " + sum / 10.0);
		
		// ���ֵ�����±�
		int max = arr[0]; // ��������һ��Ԫ�����
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i + 1] > max) {
				max = arr[i + 1];
				index = i + 1;
			}
		}
		System.out.println("���ֵ = " + max + "\t" + "�±� = " + index);

		// �����Ƿ����8
		index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 8) {
				index = i;
				System.out.println("����Ԫ��8");
				break;
			}
		}	
		if(index == -1) {
			System.out.println("������Ԫ��8");
		}
	}
}