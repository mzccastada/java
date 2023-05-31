package exercise;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow = new Cow();
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(dog);
		animals.add(cat);
		animals.add(cow);		
		animals.forEach( animal -> animal.makeSound() );
	}
}