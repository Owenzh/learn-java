package dl.ald.day20190916;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.eat();

		Dog dog = new Dog();
		Dog dog2 = new Dog();
		dog.age = 10;
		dog2.age = 10;
		if (dog.equals(dog2)) {
			System.out.println("����������ͬ");
		} else {
			System.out.println("����������ͬ");
		}
		System.out.println(dog);
		dog.eat();

		dog.method();
	}

}
