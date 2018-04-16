package br.com.patterns.decorator;

public class Launcher {

	public static void main(String[] args) {
		Espresso espresso = new Espresso();
		Caramel caramel = new Caramel(espresso);
		
		System.out.println(caramel.cost());
	}
}
