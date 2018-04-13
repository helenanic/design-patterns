package br.com.dp.strategy.clients;

import br.com.dp.strategy.behaviours.SimpleQuack;
import br.com.dp.strategy.behaviours.TextDisplay;

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
