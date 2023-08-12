package com.zookeeper.types.animals;
import com.zookeeper.types.Mammal;

public class Gorilla extends Mammal{
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("Throwing stuff here");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("Eating bananas");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Climbing stuff here");
		energyLevel -= 10;
	}
}
