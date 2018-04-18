package br.com.patterns.commander;

public class Invoker {

	ICommand on;
	ICommand off;
	ICommand up;
	ICommand down;
	
	public Invoker(ICommand on,ICommand off, ICommand up, ICommand down) {
		this.on = on;
		this.off = off;
		this.up = up;
		this.down = down;
	}
	
	public void clickOn() {
		this.on.execute();
	}
	
	public void clickOff() {
		this.off.execute();
	}
}
