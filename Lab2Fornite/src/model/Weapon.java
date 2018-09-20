package model;

import stack.StackC;
import stack.StackCException;

public class Weapon {
	
	/**
	 * the weapon's name
	 */
	
	private String name;
	
	/**
	 * the weapon's amount of bullets
	 */
	
	private int bullets;
	
	
	/**
	 * the first constructor of the class 
	 * */
	public Weapon() {
		name = "Ax"; 
		bullets = 0;
	}
	
    /**
     * the second constructor of the class
     * @param name
     * @param bullets
     */
	public Weapon(String name, int bullets) {
		this.name = name;
		this.bullets = bullets;
	}

	/**
	 * allows to get the weapon's name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * allos to set a new name for the weapon
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * allows  to get the weapon's amount of bullets
	 * @return
	 */
	public int getBullets() {
		return bullets;
	}

	/**
	 * allows to set a new amount of bullets
	 * @param bullets
	 */
	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	
	/**
	 * manage the shoot action
	 */
	public void shoot() {
		bullets -=10;
		if(bullets<0) {
			bullets = 0;
		}
	}
}
