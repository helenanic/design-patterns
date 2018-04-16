package br.com.patterns.strategy.behaviours;

import br.com.patterns.strategy.interfaces.IQuackBehaviour;

public class NoQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Cannot quack");
	}

}
