/*
 * �׸���� ���̳������α׷��� ����. �ݹ� ���߱������� �ҽ��� ���� �������ȵ��. �и� ���ֽ��� �ڵ尡 �������̶� �����ϰ� ã�ƺô�.
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
		
		
		//1,2,4�ǰ�� �ٷ�-1�� �����Ѵ�
		if(N!=3 && N<5) {
			System.out.println("-1");
			System.exit(0);
		}
		
		
		//five_max���� �ִ�� �����ִ� 5�ǹ������ ����. ������� 18�Է��ϸ� 20, 20�Է��ϸ� 20, 24�Է��ϸ� 25
		
		while(N>=five_max) {
			five_max+=5;
			five++;
			if(N==five_max) {	//���� N�� 5�� ������ ���α׷��� �����Ѵ�.five=��
				System.out.println(five);
				System.exit(0);
			}
		}
		
		while(true) {
			if(five<0) {
				break;
			}
	//		System.out.println("��for�� . ���簪 "+N+" "+five+" "+three);
			if(((five*5)+(three*3))==N) {
	//			System.out.println("üũ����Ʈ2");
				System.out.println(five+three);
				System.exit(0);
			}
			//���̺�� �Ѱ��� ������ three�� ���� ��Ȳ���°� ��������
			five--;
			while(((five*5)+(three*3))<N) {
				
//				System.out.println("---------------for�� . ���簪 "+N+" "+five+" "+three);
				three++;
			}
				
		}
		System.out.println("-1");
			
			
				
		
	
	}

}
