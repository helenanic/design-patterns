package br.com.dp.decorator;

public class Caramel extends AddOnDecorator {

	private Beverage beverage;
	
	public Caramel(Beverage b) {
		this.beverage = b;
	}
	
	@Override
	public Double cost() {
		return this.beverage.cost() + 1;
	}

}
