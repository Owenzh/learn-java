package dl.ald.day20190925_test;

public class CargoVehicle extends AVehicle implements ICarryCargo {

	private double weight;

	public CargoVehicle(String name, String usage, String type, String engine,
			double hgt, double lng, double price) {
		this.name = name;
		this.type = type;
		this.usage = usage;
		this.engine = engine;
		this.hgt = hgt;
		this.lng = lng;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void carry_cargo() {
		// TODO Auto-generated method stub
		System.out.println("�ػ���" + this.weight);
	}

	@Override
	public void print(String no) {
		// ��; ���� �۸� ����
		// TODO Auto-generated method stub
		System.out.println("_____________________________________________________________________");
		System.out.println(no+"\t"+this.usage + "\t"
				+ this.name + "\t" + this.price
				+ "/��		������:" + this.lng + " "
				+ this.hgt);
	}

}
