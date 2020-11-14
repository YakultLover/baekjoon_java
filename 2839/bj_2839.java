/*
 * 그리디와 다이나믹프로그래밍 문제. 금방 맞추긴했지만 소스가 아주 마음에안든다. 분명 아주쉬운 코드가 있을것이라 생각하고 찾아봤다.
 * 
 * 
 */



import java.util.Scanner;

public class bj_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int five_max=0;
		int five=0;
		int three=0;
		
		
		//1,2,4의경우 바로-1로 종료한다
		if(N!=3 && N<5) {
			System.out.println("-1");
			System.exit(0);
		}
		
		
		//five_max에는 최대로 들어갈수있는 5의배수값이 들어간다. 예를들어 18입력하면 20, 20입력하면 20, 24입력하면 25
		
		while(N>=five_max) {
			five_max+=5;
			five++;
			if(N==five_max) {	//만약 N이 5의 배수라면 프로그램을 종료한다.five=답
				System.out.println(five);
				System.exit(0);
			}
		}
		
		while(true) {
			if(five<0) {
				break;
			}
	//		System.out.println("밖for문 . 현재값 "+N+" "+five+" "+three);
			if(((five*5)+(three*3))==N) {
	//			System.out.println("체크포인트2");
				System.out.println(five+three);
				System.exit(0);
			}
			//파이브는 한개씩 내리고 three는 가장 상황에맞게 내려보자
			five--;
			while(((five*5)+(three*3))<N) {
				
//				System.out.println("---------------for문 . 현재값 "+N+" "+five+" "+three);
				three++;
			}
				
		}
		System.out.println("-1");
			
			
				
		
	
	}

}
