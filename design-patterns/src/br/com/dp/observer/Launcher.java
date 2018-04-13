package br.com.dp.observer;

public class Launcher {

	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		
		PhoneDisplay display = new PhoneDisplay(station);
		
		station.add(display);
		station.notifyy();
	}

}
