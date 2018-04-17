package br.com.patterns.factory.abstractfactory;

public interface CarFactory {

	SedanCar createSedanCar();
	PopularCar createPopularCar();
}
