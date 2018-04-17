package br.com.patterns.factory.factorymethod;

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
