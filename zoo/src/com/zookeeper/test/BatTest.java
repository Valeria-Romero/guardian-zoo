package com.zookeeper.test;
import com.zookeeper.types.animals.Bat;

public class BatTest {
	public static void main(String[] args) {
		
		Bat bruce = new Bat(300);
		
		bruce.eatHumans();
		bruce.displayEnergy();
		bruce.attackTown();
		bruce.displayEnergy();
		bruce.fly();
		bruce.displayEnergy();
		
	}
}
