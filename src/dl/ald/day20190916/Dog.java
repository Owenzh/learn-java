package dl.ald.day20190916;

public class Dog extends Animal {
	public Dog() {
		System.out.println("����ִ����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat();
		this.age = 30;
		System.out.println("���䣺" + this.age + " �����гԵ�����");
	}

	public void method() {
		super.eat();
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
}
