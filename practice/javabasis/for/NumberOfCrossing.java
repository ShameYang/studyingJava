// while break��ʽ��ɣ����㾭��·�ڴ���
// ĳ����100,000Ԫ
// ÿ����һ��·�ڣ��ֽ�>50,000��ÿ�ν�5%���ֽ�<=50,000��ÿ�ν�1000
public class NumberOfCrossing {
	public static void main(String[] args) {
		// ��ʼ���
		int money = 100000;
		// ����
		int count = 0;
		// ��·��
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				count++;
			}else if(money >= 1000) {
				money -= 1000;
				count++;
			}else {
				break;
			}
		}
	System.out.println("����·�ڴ�����" + count);
	}
}