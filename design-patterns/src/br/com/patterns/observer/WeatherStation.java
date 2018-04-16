package br.com.patterns.observer;

import java.util.List;

import br.com.patterns.observer.interfaces.IObservable;
import br.com.patterns.observer.interfaces.IObserver;

public class WeatherStation implements IObservable {

	private List<IObserver> observers;
	private int temperature;

	@Override
	public void add(IObserver iObserver) {
		this.observers.add(iObserver);
	}

	@Override
	public void remove(IObserver iObserver) {
		this.observers.remove(iObserver);
	}

	@Override
	public void notifyy() {
		for (IObserver iObserver : observers) {
			iObserver.update();
		}
	}
	
	public int getTemperature() {
		return this.temperature;
	}

}
