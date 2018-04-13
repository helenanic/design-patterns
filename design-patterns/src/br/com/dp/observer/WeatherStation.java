package br.com.dp.observer;

import java.util.List;

import br.com.dp.observer.interfaces.IObservable;
import br.com.dp.observer.interfaces.IObserver;

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
