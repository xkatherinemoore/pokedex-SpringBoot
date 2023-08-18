package com.tts.Pokedex.PokedexDB;

import java.util.Arrays;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
	@Id
	private int id;
	private String name;
	private String[] type;
	private boolean[] canCatch; //R, B, Y, FR, LG, Pika, Eevee
	
	public Pokemon() {
	}
	public Pokemon(int id, String name, String[] type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getType() {
		return type;
	}
	public void setType(String[] type) {
		this.type = type;
	}
	public boolean[] getCanCatch() {
		return canCatch;
	}
	public void setCanCatch(boolean[] canCatch) {
		this.canCatch = canCatch;
	}
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", type=" + Arrays.toString(type) + ", canCatch="
				+ Arrays.toString(canCatch) + "]";
	}
	
	
}
