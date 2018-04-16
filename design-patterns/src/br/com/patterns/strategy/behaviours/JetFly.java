package br.com.patterns.strategy.behaviours;

import br.com.patterns.strategy.interfaces.IFlyBehavior;

public class JetFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Jet Fly");
	}

}
