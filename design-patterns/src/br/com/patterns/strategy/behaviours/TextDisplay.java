package br.com.patterns.strategy.behaviours;

import br.com.patterns.strategy.interfaces.IDisplayBehaviour;

public class TextDisplay implements IDisplayBehaviour {

	@Override
	public void display() {
		System.out.println("Text Display");
	}

}
