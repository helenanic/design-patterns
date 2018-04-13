package br.com.dp.strategy.behaviours;

import br.com.dp.strategy.interfaces.IFlyBehavior;

public class SimpleFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Simple Fly");
	}

}
