package br.com.patterns.observer.interfaces;

public interface IObservable {

	void add(IObserver iObserver);
	
	void remove(IObserver iObserver);
	
	void notifyy();
	
}
