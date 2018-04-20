package br.com.patterns.bridge.form;

public abstract class View {

	IResource resource;
	
	public View(IResource resource) {
		this.resource = resource;
	}
	
	public abstract String show();
}
