package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Pig pig = new Pig();
		Pig pig2 = new Pig();
		Cow cow = new Cow();
		Cow cow2 = new Cow();
		Horse horse = new Horse();
		Chicken chicken = new Chicken();
		farm.add(pig);
		farm.add(cow);
		farm.add(horse);
		farm.add(chicken);
		farm.add(pig2);
		farm.add(cow2);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
