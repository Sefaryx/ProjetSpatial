package com.being.model;

public abstract class Being extends SpatialElement implements Movable {

	protected int maxSpeed = 1;
	
	public Being(String name, int x, int y, boolean inAir, int maxSpeed) {
		super(name, x, y, inAir);
		this.maxSpeed = maxSpeed;
	}

	public boolean goUp(int speed) {
		boolean res = false;
		if(speed >=0 && speed<=maxSpeed) {
			this.y += speed;
			res = true;
		}
		else {
			this.y += maxSpeed;
		}
		return res;
	}

	public boolean goDown(int speed) {
		boolean res = false;
		if(speed >=0 && speed<=maxSpeed) {
			this.y -= speed;
			res = true;
		}
		else {
			this.y -= maxSpeed;
		}
		return res;
	}

	public boolean goRight(int speed) {
		boolean res = false;
		if(speed >=0 && speed<=maxSpeed) {
			this.x += speed;
			res = true;
		}
		else {
			this.x += maxSpeed;
		}
		return res;
	}

	public boolean goLeft(int speed) {
		boolean res = false;
		if(speed >=0 && speed<=maxSpeed) {
			this.x -= speed;
			res = true;
		}
		else {
			this.x -= maxSpeed;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Being [maxSpeed=" + maxSpeed + ", x=" + x + ", y=" + y + ", inAir=" + inAir + "]";
	}

}
