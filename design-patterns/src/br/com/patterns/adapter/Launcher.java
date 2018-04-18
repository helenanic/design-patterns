package br.com.patterns.adapter;

public class Launcher {

	public static void main(String[] args) {
		ITarget target = new Adapter(new Adaptee());
	}
}
