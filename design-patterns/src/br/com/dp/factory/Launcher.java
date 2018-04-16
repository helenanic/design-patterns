package br.com.dp.factory;

import br.com.dp.factory.factorymethod.Animal;
import br.com.dp.factory.factorymethod.CatFactory;
import br.com.dp.factory.factorymethod.OtherAnimalFactory;

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
