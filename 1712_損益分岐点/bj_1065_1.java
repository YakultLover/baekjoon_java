/*
 * 첫번째시도로 단순 연산자가 아닌 if와 반복문을 사용했는데 틀렸다는 메세지가 나왔다.(자체 테스트에서는 성공)
 * 알고보니 문제에 제시된 21억번을 생각하지못해서 burfferOverflow에 빠저 일정이상 수가 입력될시에 다른값이 나오는것이였다.
 * int를 long으로 수정하여 제출하였다
 * 
 * 시간오버가 발생하여 두번째시도를하였다.
 * 전혀 오래걸릴것같은 코드는 아니라고 생각했는데 21억회에 달하는 입력값이 온다면 while문이 21억회 동작해야하므로 시간오버가 발생하는것이였다.
 * 때문에 이 문제의 의도는 반드시 반복문을 쓰지않는것인데, 혼자서 해결하지 못하던중 인터넷에서 단순 연산자만 사용하여 푸는 방법을 찾아서 공부하였다.
 */


import java.util.Scanner;

public class bj_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		long count = 0;
		
		
		
		while(true) {
			
			long sum = (count*B)+A;
			
			if(count==1) {	//메모리아끼려고 if넣었는데, 이걸로 아껴지는지는 잘 모르겠음.
				if(B >= C) {
					count=-1;
					break;
				}
			}
		//	System.out.println("sum="+sum+"count="+count+"분기점="+C*count);
			if(sum >= C * count) {
			//	System.out.println(count+"회컨티뉴됨");
				count++;
				continue;
			}
			else {
				//System.out.println("sum="+sum+"count="+count+"분기점="+C*count);
				break;
				
			}

			
		}
		System.out.println(count);
	}

}
