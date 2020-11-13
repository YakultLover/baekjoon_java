/*
 * 이렇게 바꾸면 A는 소수가 나올때가 대부분인데, 자동으로 int형으로 잘려서 출력된다.
 * 브론즈4문제라고는 믿기지 않는다.
 */


import java.util.Scanner;

public class bj_1066_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();

		

		
		if(B>=C) {
			System.out.println("-1");
		}
		else {
		System.out.println((A/(C-B)+1));
		}
	}

}
