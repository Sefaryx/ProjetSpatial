package com.being;

import java.util.ArrayList;

import com.being.model.Animal;
import com.being.model.Chicken;
import com.being.model.Dog;
import com.being.model.Eagle;
import com.being.model.Ematerial;
import com.being.model.House;
import com.being.model.Human;

public class Entry {

	public static void main(String[] args) {
		
		Animal chicken = new Chicken("cocotte", 0, 0, false, 2, null);
		Animal eagle = new Eagle("Serdaigle", 100, 100, true, 10, null);
		Animal dog = new Dog("Rantanplan", 200, 200, true, 3, null);
		
		((Eagle)eagle).land();
		eagle.goUp(15);
		System.out.println("TEST ANIMAUX");
		System.out.println(eagle);
		System.out.println(eagle.communicate());
		
		Human h1 = new Human("Paul", 300, 300, true, 1, new ArrayList<House>(), new ArrayList<Animal>(), 10000);
		Human h2 = new Human("Pierre", 400, 400, false, 2, new ArrayList<House>(), new ArrayList<Animal>(), 500000);
		
		h1.adopt(chicken);
		h2.adopt(dog);
		System.out.println("TEST ADOPTION");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(chicken);
		System.out.println(dog);
		
		House hzam = new House("Le Châlet du ZAM", 1000, 1000, true, 499999, Ematerial.Wood, h1);
		h1.getHouses().add(hzam);
		
		h1.sell(hzam, h2);
		
		System.out.println("TEST MAISON");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(hzam);
		
	}

}
