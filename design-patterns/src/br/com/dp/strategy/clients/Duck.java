package br.com.dp.strategy.clients;

import br.com.dp.strategy.behaviours.SimpleFly;
import br.com.dp.strategy.interfaces.IDisplayBehaviour;
import br.com.dp.strategy.interfaces.IFlyBehavior;
import br.com.dp.strategy.interfaces.IQuackBehaviour;

public abstract class Duck {

	IFlyBehavior flyBehaviour;
	IQuackBehaviour quackBehaviour;
	IDisplayBehaviour displayBehaviour;
	
	public IFlyBehavior getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(IFlyBehavior flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public IQuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public IDisplayBehaviour getDisplayBehaviour() {
		return displayBehaviour;
	}

	public void setDisplayBehaviour(IDisplayBehaviour displayBehaviour) {
		this.displayBehaviour = displayBehaviour;
	}

	public void fly() {
		this.flyBehaviour.fly();
	}
	
	public void display() {
		this.displayBehaviour.display();
	}
	
	public void quack() {
		this.quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All ducks can swim!");
	}

}
