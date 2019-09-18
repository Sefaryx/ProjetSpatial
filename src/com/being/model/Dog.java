package com.being.model;

public class Dog extends Animal{

	public Dog(String name, int x, int y, boolean inAir, int maxSpeed, Human human) {
		super(name, x, y, inAir, maxSpeed, human);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String communicate() {
		String res = "Wooof wooof";
		return res;
	}

}
