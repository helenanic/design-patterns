package br.com.dp.strategy.behaviours;

import br.com.dp.strategy.interfaces.IQuackBehaviour;

public class NoQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Cannot quack");
	}

}
