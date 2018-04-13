package br.com.dp.strategy.clients;

import br.com.dp.strategy.behaviours.SimpleFly;
import br.com.dp.strategy.behaviours.SimpleQuack;

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
