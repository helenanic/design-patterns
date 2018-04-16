package br.com.patterns.strategy.behaviours;

import br.com.patterns.strategy.interfaces.IFlyBehavior;

public class SimpleFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Simple Fly");
	}

}
