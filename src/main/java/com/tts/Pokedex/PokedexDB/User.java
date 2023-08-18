package com.tts.Pokedex.PokedexDB;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String imageURL;
	private String gameVersion;
	private String[] siteBadges;
	
	public User() {
	}
	public User(String firstName, String lastName, String email, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getGameVersion() {
		return gameVersion;
	}
	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}
	public String[] getSiteBadges() {
		return siteBadges;
	}
	public void setSiteBadges(String[] siteBadges) {
		this.siteBadges = siteBadges;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", imageURL=" + imageURL + ", gameVersion=" + gameVersion + ", siteBadges="
				+ Arrays.toString(siteBadges) + "]";
	}
	
}
