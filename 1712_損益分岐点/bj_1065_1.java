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
			
			if(count==1) {	//�޸𸮾Ƴ����� if�־��µ�, �̰ɷ� �Ʋ��������� �� �𸣰���.
				if(B >= C) {
					count=-1;
					break;
				}
			}
		//	System.out.println("sum="+sum+"count="+count+"�б���="+C*count);
			if(sum >= C * count) {
			//	System.out.println(count+"ȸ��Ƽ����");
				count++;
				continue;
			}
			else {
				//System.out.println("sum="+sum+"count="+count+"�б���="+C*count);
				break;
				
			}

			
		}
		System.out.println(count);
	}

}
