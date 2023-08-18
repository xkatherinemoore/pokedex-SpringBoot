package com.tts.Pokedex.PokedexDB;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gym {
	
	@Id
	private int id;
	private String city;
	private String gymLeader;
	private String badge;
	
	public Gym() {	
	}	
	public Gym(int id, String city, String gymLeader, String badge) {
		this.id = id;
		this.city = city;
		this.gymLeader = gymLeader;
		this.badge = badge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGymLeader() {
		return gymLeader;
	}
	public void setGymLeader(String gymLeader) {
		this.gymLeader = gymLeader;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	@Override
	public String toString() {
		return "Gym [id=" + id + ", city=" + city + ", gymLeader=" + gymLeader + ", badge=" + badge + "]";
	}
	
	
}
