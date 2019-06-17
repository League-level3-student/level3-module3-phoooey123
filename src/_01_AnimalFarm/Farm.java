package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Pig pig = new Pig();
		Cow cow = new Cow();
		Horse horse = new Horse();
		Chicken chicken = new Chicken();
		farm.add(pig);
		farm.add(cow);
		farm.add(horse);
		farm.add(chicken);
	}
}
