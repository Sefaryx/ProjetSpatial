package com.being.model;

public class MobileHome extends House implements Movable{

	public MobileHome(String name, int x, int y, boolean inAir, int price, Ematerial material, Human human) {
		super(name, x, y, inAir, price, material, human);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean goUp(int speed) {
		this.y += speed;
		return true;
	}

	@Override
	public boolean goDown(int speed) {
		this.y -= speed;
		return true;
	}

	@Override
	public boolean goRight(int speed) {
		this.x += speed;
		return true;
	}

	@Override
	public String toString() {
		return "MobileHome [material=" + material + ", human=" + human + ", x=" + x + ", y=" + y + ", inAir=" + inAir
				+ "]";
	}

	@Override
	public boolean goLeft(int speed) {
		this.x -= speed;
		return true;
	}

}
