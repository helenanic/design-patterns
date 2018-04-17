package br.com.patterns.factory.abstractfactory;

public class FiatFactory implements CarFactory {

	@Override
	public SedanCar createSedanCar() {
		return new Siena();
	}

	@Override
	public PopularCar createPopularCar() {
		return new Palio();
	}

}
