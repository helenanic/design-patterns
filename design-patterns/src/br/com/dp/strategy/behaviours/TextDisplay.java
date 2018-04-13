package br.com.dp.strategy.behaviours;

import br.com.dp.strategy.interfaces.IDisplayBehaviour;

public class TextDisplay implements IDisplayBehaviour {

	@Override
	public void display() {
		System.out.println("Text Display");
	}

}
