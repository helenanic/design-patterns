package br.com.patterns.bridge.form;

public class LongForm extends View {

	public LongForm(IResource resource) {
		super(resource);
	}

	@Override
	public String show() {
		return this.resource.snippet();
	}

}
