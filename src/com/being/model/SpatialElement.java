package com.being.model;

public abstract class SpatialElement {
	
	private String name;
	protected int x;
	protected int y;
	protected boolean inAir;
	
	public SpatialElement(String name, int x, int y, boolean inAir) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.inAir = inAir;
	}

	@Override
	public String toString() {
		return "SpatialElement [name=" + name + ", x=" + x + ", y=" + y + ", inAir=" + inAir + "]";
	}

}
