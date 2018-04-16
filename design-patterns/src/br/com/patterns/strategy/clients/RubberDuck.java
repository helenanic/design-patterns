package br.com.patterns.strategy.clients;

import br.com.patterns.strategy.behaviours.SimpleQuack;
import br.com.patterns.strategy.behaviours.TextDisplay;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.quackBehaviour = new SimpleQuack();
		this.displayBehaviour = new TextDisplay();
	}
	
	@Override
	public void fly() {
		System.out.println("Cannot fly!");
	}

}
