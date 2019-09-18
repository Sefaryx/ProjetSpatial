package com.being.model;

import java.util.List;

public class Human extends Being implements Adopter, Buyer {

	private List<House> houses;
	private List<Animal> animals;
	private int money;

	public Human(String name, int x, int y, boolean inAir, int maxSpeed, List<House> houses, List<Animal> animals,
			int money) {
		super(name, x, y, inAir, maxSpeed);
		this.houses = houses;
		this.animals = animals;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Human [houses=" + houses.size() + ", animals=" + animals.size() + ", money=" + money + "]";
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public int getMoney() {
		return money;
	}

	@Override
	public boolean buy(House h, Human owner) {
		boolean res = false;
		if (this.money >= h.getPrice() && owner.houses.contains(h)) {
			this.money -= h.getPrice();
			owner.money += h.getPrice();
			this.houses.add(h);
			owner.houses.remove(h);
			h.setHuman(this);
			res = true;
		}
		return res;
	}

	@Override
	public void sell(House h, Human buyer) {
		if(houses.contains(h) && buyer.money>=h.getPrice()) {
			this.money += h.getPrice();
			buyer.money -= h.getPrice();
			this.houses.remove(h);
			buyer.houses.add(h);
			h.setHuman(buyer);
		}
	}

	public List<House> getHouses() {
		return houses;
	}

	@Override
	public boolean adopt(Animal a) {
		boolean res = false;
		
		if (a.getHuman()==null) {
			a.setHuman(this);
			this.animals.add(a);
			res = true;
		}
		
		return res;
	}

	@Override
	public boolean revoke(Animal a) {
		a.setHuman(null);
		this.animals.remove(a);
		return true;
	}

}
