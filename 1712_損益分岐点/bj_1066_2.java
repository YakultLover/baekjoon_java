/*
 * �̷��� �ٲٸ� A�� �Ҽ��� ���ö��� ��κ��ε�, �ڵ����� int������ �߷��� ��µȴ�.
 * �����4�������� �ϱ��� �ʴ´�.
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
