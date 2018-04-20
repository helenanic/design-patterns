package br.com.patterns.bridge;

public class Launcher {

	public static void main(String[] args) {
		Circle circle = new Circle(100, 100, 10, new RedCircle());
		circle.draw();
		
		circle = new Circle(100, 100, 10, new GreenCircle());
		circle.draw();
	}
}
