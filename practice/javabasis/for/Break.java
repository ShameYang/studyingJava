// �� for + break ʵ�ֵ�¼��֤
// �����λ��ᣬ����û���Ϊ�����桱������Ϊ��666����ʾ��¼�ɹ���������ʾ�û�����������󣬻��м��λ���
import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			
			System.out.print("�û�����");
			String username = sc.next();
			
			System.out.print("���룺");
			String password = sc.next();
			
			if(username.equals("����") && password.equals("666")) {
				System.out.println("��¼�ɹ�");
				break;
			}else {
				System.out.println("�û�����������󣬻���" + (3 - i) + "�λ���");
			}
		}
	}
}