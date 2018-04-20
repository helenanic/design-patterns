package br.com.patterns.bridge.form;

public class Launcher {

	public static void main(String[] args) {
		Artist artist = new Artist();
		ArtistResource resource = new ArtistResource(artist);
		
		System.out.println(resource.snippet());	
		System.out.println(resource.image());	
		System.out.println(resource.title());
		System.out.println(resource.url());	
	}
}
