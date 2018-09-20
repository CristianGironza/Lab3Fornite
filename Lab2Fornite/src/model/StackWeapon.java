package model;

import java.util.Random;

import stack.StackC;

import stack.StackCException;

public class StackWeapon extends StackC<Weapon> {
	
	/**
	 * this help to defined what weapon has been pick up 
	 * */
	private Random luck;
	
	/**
	 * this array contains the different weapons that the player can use 
	 * */
	public static final String[] WEAPONS = {"Gun", "Machine gun", "Grenade", "Shotgun", "Bazooka"};
	
	/**
	 * StackWeapon() : the constructor of the class, add to new weapon of the stack
	 * */
	public StackWeapon() {
		super.push(new Weapon());
	}
	
	/**
	 * ShootCurrentWeapon() : this method shoot the weapon that person use in that moment 
	 * @throws StackCException : this exception is throw when the Stack is empty
	 * */
	public void ShootCurrentWeapon() throws StackCException {
		super.peek().shoot();
		ThrowWeapon();
	}
	
	/**
	 * ThrowWeapon() : this method throw the weapon when this have 0 bullets 
	 *  @throws StackCException : this exception is throw when the Stack is empty
	 * */
	public void ThrowWeapon() throws StackCException {
		if(super.peek().getBullets()==0 && !super.peek().getName().equals("Ax")) {
			super.pop();
		}
	}
	
	/**
	 * this method pick up the weapon to the stack of weapons 
	 * */
	public void PickUpWeapon() {
		int bullets = luck.nextInt(100)+1;
		String name = WEAPONS[luck.nextInt(5)];
		super.push(new Weapon(name, bullets));
	}
}
