package dl.ald.day20190913;
import java.util.Scanner;

/*
 * ���ܣ�ʵ�ֽ��������༶������ѧԱ�ĳɼ���Ϣ��Ȼ�����ÿ���༶ѧԱ�ɼ���ƽ���֣�
 * 
*/

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int i=1; i<4;i++) {
			System.out.println("������༶"+i+"�ĳɼ���Ϣ��");
			
			for(int j=1;j<5;j++) {
				System.out.print("������༶"+i+"�У�ѧ��"+j+"�ķ�����");
				
				sum+=input.nextInt();
			}
			System.out.println("�༶"+i+"���ܷ֣�ƽ���֣�"+(sum/4));
			sum = 0;
		}
	}

}
