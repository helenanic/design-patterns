package br.com.patterns.adapter;

public class Adapter implements ITarget {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		this.adaptee.specificRequest();
		//se for uma biblioteca estatica
		//Adaptee.specificRequest();
	}

}
