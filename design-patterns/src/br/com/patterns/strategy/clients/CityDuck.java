package br.com.patterns.strategy.clients;

import br.com.patterns.strategy.behaviours.SimpleFly;
import br.com.patterns.strategy.behaviours.SimpleQuack;

public class CityDuck extends Duck {

	public CityDuck() {
		this.quackBehaviour = new SimpleQuack();
		this.flyBehaviour = new SimpleFly();
	}

	@Override
	public void display() {
		System.out.println("This is a CITY duck!");
	}

}
