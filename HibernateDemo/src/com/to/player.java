package com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class player {
	
	@Id
	private int playerID;
	private String playerName;
	private String teamName;
	private int age;
	public player()
	{
		
	}
	public player(int playerID, String playerName, String teamName, int age) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.teamName = teamName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "player [playerID=" + playerID + ", playerName=" + playerName + ", teamName=" + teamName + ", age=" + age
				+ "]";
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
