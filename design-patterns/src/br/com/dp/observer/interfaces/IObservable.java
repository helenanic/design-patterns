package br.com.dp.observer.interfaces;

public interface IObservable {

	void add(IObserver iObserver);
	
	void remove(IObserver iObserver);
	
	void notifyy();
	
}
