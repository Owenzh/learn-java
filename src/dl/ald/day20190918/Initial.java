package dl.ald.day20190918;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army();
		System.out.println(a);
		
		Army a2 = new Army("A0001","ִ�п���",120.6);
		System.out.println(a2);
		
		Army a3 = new Navy();
		System.out.println(a3);
		
		if(a3 instanceof LandForce) {
			a3.combat();
		}else{
			System.out.println("��ǰ����LandForceʵ����������ת����");
		}
		
		if(a3 instanceof AirForce) {
			AirForce a4 = (AirForce)a3;
			a4.combat();
		}else{
			System.out.println("��ǰ����AirForceʵ����������ת����");
		}
		
		
	}

}
