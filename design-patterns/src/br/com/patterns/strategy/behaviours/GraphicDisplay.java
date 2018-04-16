package br.com.patterns.strategy.behaviours;

import br.com.patterns.strategy.interfaces.IDisplayBehaviour;

public class GraphicDisplay implements IDisplayBehaviour {

	@Override
	public void display() {
		System.out.println("Graphic Display");
	}

}
