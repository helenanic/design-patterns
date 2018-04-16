package br.com.patterns.strategy;

import br.com.patterns.strategy.behaviours.GraphicDisplay;
import br.com.patterns.strategy.behaviours.JetFly;
import br.com.patterns.strategy.behaviours.NoQuack;
import br.com.patterns.strategy.clients.Duck;
import br.com.patterns.strategy.clients.RubberDuck;

public class Launcher {

	public static void main(String[] args) {
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.fly();
		rubberDuck.quack();
		
		System.out.println("---------------------");
		rubberDuck.setDisplayBehaviour(new GraphicDisplay());
		rubberDuck.setFlyBehaviour(new JetFly());
		rubberDuck.setQuackBehaviour(new NoQuack());
		
		rubberDuck.display();
		rubberDuck.fly();
		rubberDuck.quack();
	}
}
