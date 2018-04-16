package br.com.patterns.factory;

import br.com.patterns.factory.factorymethod.Animal;
import br.com.patterns.factory.factorymethod.CatFactory;
import br.com.patterns.factory.factorymethod.OtherAnimalFactory;

public class Launcher {

	public static void main(String[] args) {
		CatFactory factory = new CatFactory();
		
		Animal animal = factory.createAnimal();
		animal.showInfo();
		
		OtherAnimalFactory otherFactory = new OtherAnimalFactory();
		Animal otherAnimal = otherFactory.createAnimal("canine");
		otherAnimal.showInfo();
	}
}
