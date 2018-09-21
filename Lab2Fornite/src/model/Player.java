package model;

import stack.StackCException;

public class Player {
	
	/**
	 * constant that specifies the type of platform used by the player
	 */
	public final static String[] PLATAFORM = {"PlayStation 4", "Android", "Nintendo Switch"
											 ,"Xbox One","Microsoft Windows", "Mac OS", "iOS"};
	/**
	 * constant that specifies player's level
	 */
	public final static String[] LEVEL = {"ProPlayer", "MediumPlayer", "AmateurPlayer", "NoodPlayer", "SuperNoodPlayer"}; 
	
	/**
	 * amount of kills made by the player
	 */
	private int kills; 
	
	/**
	 * amount of deaths of the player
	 */
	private int deahts; 

	/**
	 * ping of player's connection
	 */
	private int ping; 
	
	/**
	 * amount of played time
	 */
	private double timePlayed; 
	

	/**
	 * the plataform used by the player
	 */
	private String plataform; 
	
	/**
	 * the player's location
	 */
	private String location;

	/**
	 * the player's level
	 */
	private String level; 
	
	/**
	 * User´s weapons
	 */
	private StackWeapon weapons;
	
	public Player(int kills, int deahts, int timePlayed, String plataform, int ping, String location, String level) {
		this.kills = kills;
		this.deahts = deahts;
		this.timePlayed = timePlayed;
		this.plataform = plataform;
		this.ping = ping;
		this.location = location;
		this.level = level; 
		weapons = new StackWeapon();
	}

	/**
	 * allows to get the amount of player's kills
	 * @return amount of kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * allows to set the new amount of kills
	 */
	public void setKills(int kills) {
		this.kills = kills;
	}

	/**
	 * allows to get the amount of player's Deaths
	 * @return amount of deaths
	 */
	public int getDeahts() {
		return deahts;
	}

	/**
	 * allows to set the new amount of deaths
	 */
	public void setDeahts(int deahts) {
		this.deahts = deahts;
	}

	/**
	 * allows to get the total player's time
	 * @return total timee
	 */
	public double getTimePlayed() {
		return timePlayed;
	}

	/**
	 * allows to set the new player's time
	 */
	public void setTimePlayed(double timePlayed) {
		this.timePlayed = timePlayed;
	}

	/**
	 * allows to get the specific plataform used by the player
	 * @return name of platform
	 */
	public String getPlataform() {
		return plataform;
	}

	/**
	 * allows to set the new player's platform
	 */
	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	/**
	 * allows to get the ping of player's connection
	 * @return player's ping
	 */
	public int getPing() {
		return ping;
	}

	/**
	 * allows to set the new player's ping
	 */
	public void setPing(int ping) {
		this.ping = ping;
	}

	/**
	 * allows to get the player's location
	 * @return player's location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * allows to set the new player's location
	 */
	public void setLocation(String location) {
		this.location = location;
	} 
	
	/**
	 * allows to get the player's level
	 * @return player's level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * allows to set the new player's level
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * allos to calculate player's level based on
	 * the amount of kills, deaths and time played
	 * @param kills amount of kills
	 * @param death amount of deaths
	 * @param timePlayed amount of time played
	 */
	public void calculateLevel(int kills, int death , int timePlayed ) {
		
		double level = (kills- death)/ timePlayed; 
		
		if (level >= 2100) {
			this.setLevel(LEVEL[0]);
		}
		
		else if (level >  1800 	&& level <= 1999) {
			this.setLevel(LEVEL[1]);
		}
		
		else if(level >  1600 	&& level <= 1799) {
			this.setLevel(LEVEL[2]);
		}

		else if(level >  1400 	&& level <= 1599) {
			this.setLevel(LEVEL[3]);
		}

		else if( level <= 1399) {
			this.setLevel(LEVEL[4]);
		}
	}
	
	/**
	 * ShootCurrentWeapon() : this method shoot the weapon that person use in that moment 
	 * @throws StackCException : this exception is throw when the Stack is empty
	 * */
	public void ShootCurrentWeapon() throws StackCException {
		weapons.ShootCurrentWeapon();
	}
	
	/**
	 * this method pick up the weapon to the stack of weapons 
	 * */
	public void PickUpWeapon() {
		weapons.PickUpWeapon();
	}

}
