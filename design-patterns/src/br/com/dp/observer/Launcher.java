package br.com.dp.observer;

public class Launcher {

	/**
	 * Método para testar.
	 * @param args
	 */
	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		
		PhoneDisplay display = new PhoneDisplay(station);
		
		station.add(display);
		station.notifyy();
	}

}
