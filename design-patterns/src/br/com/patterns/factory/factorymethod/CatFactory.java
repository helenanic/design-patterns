package br.com.patterns.factory.factorymethod;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
