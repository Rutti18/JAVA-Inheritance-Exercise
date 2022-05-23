
// Exercise 1

public class Herds {

	public static void main(String[] args) {
		//Part1: Implementing the Organism Class
		Organism organism = new Organism(20, 30);
		System.out.println(organism);
		organism.move(-10, 5);
		System.out.println(organism);
		organism.move(50, 20);
		System.out.println(organism);
		
		//Part2: Implementing the Herd
		Herd herd = new Herd();
		herd.addToHerd(new Organism(57, 66));
		herd.addToHerd(new Organism(73, 56));
		herd.addToHerd(new Organism(46, 52));
		herd.addToHerd(new Organism(19, 107));
		System.out.println(herd);
	}
}
