package br.com.patterns.proxy.bookparser;

public class Launcher {

	public static void main(String[] args) {
		
		BookParser bookParser = new BookParser("Livro dos gatos");
		System.out.println(bookParser.getNumPages());
		
		LazyBookParserProxy lazyBookParser = new LazyBookParserProxy();
		System.out.println(lazyBookParser.getNumPages());
	}
}
