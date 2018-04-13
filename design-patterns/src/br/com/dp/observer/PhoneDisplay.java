package br.com.dp.observer;

import br.com.dp.observer.interfaces.IDisplay;
import br.com.dp.observer.interfaces.IObserver;

public class PhoneDisplay implements IObserver, IDisplay {

	private WeatherStation station;

	public PhoneDisplay(WeatherStation station) {
		this.station = station;
	}

	@Override
	public void update() {
		this.station.getTemperature();
	}

}
