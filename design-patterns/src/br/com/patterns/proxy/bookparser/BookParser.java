package br.com.patterns.proxy.bookparser;

public class BookParser implements IBookParser {

	public BookParser(String book) {
		System.out.println("Passou no bookparser");
	}
	
	public int getNumPages() {
		return 0;
	}
}
