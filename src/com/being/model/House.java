package com.being.model;

public class House extends SpatialElement{
	
	private int price;
	protected Ematerial material;
	protected Human human;//null if no human

	public House(String name, int x, int y, boolean inAir, int price, Ematerial material, Human human) {
		super(name, x, y, inAir);
		this.price = price;
		this.material = material;
		this.human = human;
	}

	public int getPrice() {
		return price;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	public String toString() {
		return "House [price=" + price + ", material=" + material + ", human=" + human + "]";
	}

}
