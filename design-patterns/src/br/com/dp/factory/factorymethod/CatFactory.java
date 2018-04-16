package br.com.dp.factory.factorymethod;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
