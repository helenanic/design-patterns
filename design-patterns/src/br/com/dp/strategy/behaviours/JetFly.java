package br.com.dp.strategy.behaviours;

import br.com.dp.strategy.interfaces.IFlyBehavior;

public class JetFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Jet Fly");
	}

}
