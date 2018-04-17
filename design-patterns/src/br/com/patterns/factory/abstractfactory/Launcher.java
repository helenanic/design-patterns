package br.com.patterns.factory.abstractfactory;

public class Launcher {

	public static void main(String[] args) {
		CarFactory carFactory = new FiatFactory();
		SedanCar sedanCar = carFactory.createSedanCar();
		PopularCar popularCar = carFactory.createPopularCar();
		sedanCar.showSedanInfo();
		popularCar.showPopularInfo();
		
	}
}
