import java.util.Scanner;

public class ShuZi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		System.out.println("什么数字像两个小圈圈");
		System.out.println("请输入数字：");
		int a=3;
		int shuzi=s.nextInt();
		while(shuzi!=a) {
			if(shuzi>a) {
				System.out.println("亲，数字大了");
				shuzi=s.nextInt();
				
			}else {System.out.println("数字猜小了");
			shuzi=s.nextInt();
			}
		}
		System.out.println("恭喜你答对了");

	}

}
