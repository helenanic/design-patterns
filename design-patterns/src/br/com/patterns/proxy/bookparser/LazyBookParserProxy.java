package br.com.patterns.proxy.bookparser;

public class LazyBookParserProxy implements IBookParser {

	private BookParser bookParser = null;
	private String book;

	@Override
	public int getNumPages() {
		if(bookParser == null) {
			this.bookParser = new BookParser(this.book);
		}
		return this.bookParser.getNumPages();
	}
}
