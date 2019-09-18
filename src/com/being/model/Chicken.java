package com.being.model;

public class Chicken extends Animal implements Flying{

	public Chicken(String name, int x, int y, boolean inAir, int maxSpeed, Human human) {
		super(name, x, y, inAir, maxSpeed, human);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String communicate() {
		String res = "cuckooooo";
		return res;
	}

	@Override
	public boolean takeOff() {
		boolean res = false;
		if(!this.inAir) {
			this.inAir=true;
			res = true;
		}
		return res;
	}

	@Override
	public boolean land() {
		boolean res = false;
		if(this.inAir) {
			this.inAir=false;
			res = true;
		}
		return res;
	}

}
