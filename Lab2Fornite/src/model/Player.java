package model;

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
	
	public Player(int kills, int deahts, int timePlayed, String plataform, int ping, String location, String level) {
		this.kills = kills;
		this.deahts = deahts;
		this.timePlayed = timePlayed;
		this.plataform = plataform;
		this.ping = ping;
		this.location = location;
		this.level = level; 
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeahts() {
		return deahts;
	}

	public void setDeahts(int deahts) {
		this.deahts = deahts;
	}

	public double getTimePlayed() {
		return timePlayed;
	}

	public void setTimePlayed(double timePlayed) {
		this.timePlayed = timePlayed;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public int getPing() {
		return ping;
	}

	public void setPing(int ping) {
		this.ping = ping;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	} 
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
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
	

}
