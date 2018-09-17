package model;

import java.util.Random;

import stack.StackC;

import stack.StackCException;

public class StackGun extends StackC<Weapon> {
	
	private Random luck;
	public static final String[] WEAPONS = {"Gun", "Machine gun", "Grenade", "Shotgun", "Bazooka"};
	
	public StackGun() {
		super.push(new Weapon());
	}
	
	public void ShootCurrentWeapon() throws StackCException {
		super.peek().shoot();
		ThrowWeapon();
	}
	
	public void ThrowWeapon() throws StackCException {
		if(super.peek().getBullets()==0 && !super.peek().getName().equals("Ax")) {
			super.pop();
		}
	}
	
	public void PickUpWeapon() {
		int bullets = luck.nextInt(100)+1;
		String name = WEAPONS[luck.nextInt(5)];
		super.push(new Weapon(name, bullets));
	}
}
