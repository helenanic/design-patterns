package br.com.patterns.observer;

import br.com.patterns.observer.interfaces.IDisplay;
import br.com.patterns.observer.interfaces.IObserver;

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
