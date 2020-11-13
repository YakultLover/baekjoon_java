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
