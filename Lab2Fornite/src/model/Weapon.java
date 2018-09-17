package model;

import stack.StackC;
import stack.StackCException;

public class Weapon {
	
	private String name;
	
	private int bullets;
	
	public Weapon() {
		name = "Ax"; 
		bullets = 0;
	}
	
	public Weapon(String name, int bullets) {
		this.name = name;
		this.bullets = bullets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	
	public void shoot() {
		bullets -=10;
		if(bullets<0) {
			bullets = 0;
		}
	}
}
