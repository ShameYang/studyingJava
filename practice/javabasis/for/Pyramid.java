// ��ӡ������
//     *      ��һ�㣺�ĸ��ո�
//    ***     �ڶ��㣺�����ո�
//   *****    �����㣺�����ո�
//  *******   ���Ĳ㣺һ���ո�
// *********  ����㣺����ո�
//
// ˼·������
//  1.��ӡ����(5 * 5)��ȷ������
//  2.��ӡֱ�������Σ�ȷ��*��
//  3.��ӡÿ�пո񣬿ո��� = �ܲ��� - ��ǰ����
// ������
//  ����������
import java.util.Scanner;

public class Pyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("��������������ܲ�����");
		int layer = sc.nextInt(); // �ܲ���
		for (int i = 1; i <= layer; i++){ // i��ʾ����������
			
			for (int k = 1; k <= layer - i; k++){ // k��ʾÿ��ո���
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++){ // j��ʾÿ���*��
				System.out.print("*");
			}
			System.out.println();
		}
	}
}