package dl.ald.day20190924;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.message();
		Telphone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		
		IPlayGame ip1 = new SmartPhone();
		IPlayGame ip2 = new Psp();
		
		ip1.palyGame();
		ip2.palyGame();
		
		IPlayGame ip3 = new IPlayGame(){

			@Override
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ʵ�ֽӿ�");
			}
			
		};//����ӷֺ�
		
		ip3.palyGame();
		
		
		new IPlayGame(){
			@Override
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ʵ�ֽӿ�2");
			}
			
		}.palyGame();
		
	}

}
