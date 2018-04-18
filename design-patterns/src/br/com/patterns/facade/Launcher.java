package br.com.patterns.facade;

public class Launcher {

	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.run();
	}
}
