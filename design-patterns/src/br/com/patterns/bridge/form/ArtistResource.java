package br.com.patterns.bridge.form;

public class ArtistResource implements IResource {

	public Artist artist;
	
	public ArtistResource(Artist artist) {
		this.artist = artist;
	}
	
	@Override
	public String snippet() {
		return this.artist.bio();
	}

	@Override
	public String title() {
		return this.artist.name();
	}

	@Override
	public String image() {
		return null;
	}

	@Override
	public String url() {
		return null;
	}

}
