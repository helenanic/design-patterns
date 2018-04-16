package br.com.patterns.factory.factorymethod;

public class OtherAnimalFactory {

	public Animal createAnimal(String type) {
		if("canine".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
