// ���� 1 - 1/2 + 1/3 - 1/4...- 1/100
public class Calculate {
	public static void main(String[] args) {
		// +������� 1 + 1/3 + 1/5...+ 1/99
		double sum1 = 0;
		for (int i = 1; i < 100; i += 2) {
			sum1 += 1.0 / i;
		}
		// -������� 1/2 + 1/4...+ 1/100
		double sum2 = 0;
		for (int j = 2; j <= 100; j += 2) {
			sum2 += 1.0 / j;
		}
		double result = sum1 - sum2;
		System.out.println(result);
	
		// �Ż�
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) { // �� iΪ����
				sum += 1.0 / i;
			}else {
				sum -= 1.0 /i;
			}
		}
		System.out.println(sum);	
	}
}
