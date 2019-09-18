package com.being.model;

public abstract class Animal extends Being {
	
	private Human human;
	
	public Animal(String name, int x, int y, boolean inAir, int maxSpeed, Human human) {
		super(name, x, y, inAir, maxSpeed);
		this.human = human;
	}

	public abstract String communicate();

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	public String toString() {
		return "Animal [human=" + human + ", maxSpeed=" + maxSpeed + ", x=" + x + ", y=" + y + ", inAir=" + inAir + "]";
	}

}
