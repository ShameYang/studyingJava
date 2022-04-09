// 用 for + break 实现登录验证
// 有三次机会，如果用户名为“丁真”，密码为“666”提示登录成功，否则提示用户名或密码错误，还有几次机会
import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			
			System.out.print("用户名：");
			String username = sc.next();
			
			System.out.print("密码：");
			String password = sc.next();
			
			if(username.equals("丁真") && password.equals("666")) {
				System.out.println("登录成功");
				break;
			}else {
				System.out.println("用户名或密码错误，还有" + (3 - i) + "次机会");
			}
		}
	}
}