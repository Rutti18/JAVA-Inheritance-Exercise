
// Exercise 2

public class Animals {

	public static void main(String[] args) {
		//Part 2:  Dog
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
		
		Dog fido = new Dog("Fido");
		fido.bark();
		
		//Part 3 :Cat
		Cat cat = new Cat();
		cat.purr();
		cat.eat();

		Cat garfield = new Cat("Garfield");
		garfield.purr();
		
		//Part4 : NoiseCapable
		NoiseCapable dog1 = new Dog();
		dog.makeNoise();

		NoiseCapable cat1 = new Cat("Garfield");
		cat.makeNoise();
		Cat c = (Cat) cat;
		c.purr();
	}
}
