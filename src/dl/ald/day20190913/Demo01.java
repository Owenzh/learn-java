package dl.ald.day20190913;
import java.util.Scanner;
/*
 * ���ܣ�����ѧ���ɼ����ҵ��ɼ�С��60��ʱ���Զ��ӷֵ�60������ӷ�ǰ�ɼ����ӷֺ�ɼ����ӷִ�����
 * 
*/
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = input.nextInt();
		int count = 0;
		System.out.println("�ӷ�ǰ�ɼ���"+score);
		while(score<60) {
			count++;
			score++;
		}
		System.out.println("�ӷֺ�ɼ���"+score);
		System.out.println("�ӷִ�����"+count);
		
	}

}
