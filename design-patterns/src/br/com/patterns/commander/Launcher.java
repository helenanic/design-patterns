package br.com.patterns.commander;

public class Launcher {

	public static void main(String[] args) {
		Light light = new Light();
		Invoker invoker = new Invoker(new LightOnCommand(light), new LightOnCommand(light), new LightOnCommand(light), new LightOnCommand(light));
			
	}

}
