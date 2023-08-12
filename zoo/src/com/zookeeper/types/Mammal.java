package com.zookeeper.types;

public class Mammal {
	public int energyLevel = 100;
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Nivel de energia: " + energyLevel);
		return energyLevel;
	}
}
