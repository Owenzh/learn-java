package dl.ald.day20190914;
import java.time.LocalDate;
import java.util.Arrays;

public class Movie {
	String name;
	String type;
	String[] actors;
	float duriation;
	LocalDate  show;
	static int MD = 1;
	
	public Movie() {
		
	}
	public Movie(String _name,String _type, String[] _actors,float _duriation, LocalDate  _show) {
		name = _name;
		type = _type;
		actors = _actors;
		duriation = _duriation;
		show = _show;
	}

	void print() {
		System.out.println("��Ӱ��Ϣ");
		System.out.println("���֣�"+name);
		System.out.println("���ͣ�"+type);
		System.out.println("���ݣ�"+Arrays.toString(actors));
		System.out.println("Ƭ����"+duriation+"����");
		System.out.println("ʱ�䣺"+show);
		System.out.println("��Ƶ��"+MD);
	}
	
	void doShow(String loc,int num) {
		System.out.println("-------------------------------------");
		print();
		System.out.println("��ӳ������"+loc);
		System.out.println("��ӳ���Σ�"+num+"��");
		System.out.println("-------------------------------------");
	}
}
