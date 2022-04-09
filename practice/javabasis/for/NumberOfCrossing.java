// while break方式完成，计算经过路口次数
// 某人有100,000元
// 每经过一次路口：现金>50,000，每次交5%；现金<=50,000，每次交1000
public class NumberOfCrossing {
	public static void main(String[] args) {
		// 起始金额
		int money = 100000;
		// 计数
		int count = 0;
		// 过路口
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
	System.out.println("经过路口次数：" + count);
	}
}