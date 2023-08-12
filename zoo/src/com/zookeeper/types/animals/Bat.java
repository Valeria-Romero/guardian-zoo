package com.zookeeper.types.animals;
import com.zookeeper.types.Mammal;

public class Bat extends Mammal{
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("Woooosh~! Flying bat");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Yummy");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Heeeelp! Ahhhh! Is that a bat over the Empire State Building?");
		energyLevel -= 100;
	}
}
