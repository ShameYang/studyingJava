// ˳�����
// �������ֲ�����±�
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String[] names = {"�϶�","����","�ϰ�"};
		Scanner sc = new Scanner(System.in);
		
		// ��������
		System.out.println("����������");
		String findName = sc.next();
		
		// �������飬��һ�Ƚ�
		int index = -1;
		for (int i = 0; i < names.length; i++) {
		// equals �ַ����Ƚ�
			if(findName.equals(names[i])) {
				System.out.println("��ϲ���ҵ�" + findName);
				System.out.println("�±� = " + i);
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("Ŷ~û�ҵ�");
		}
	}
}