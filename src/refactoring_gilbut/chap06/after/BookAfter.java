package refactoring_gilbut.chap06.after;

public class BookAfter {
	private String title;
	private String isbn;
	private String price;
	private Author author;
	
	public BookAfter(String title, String isbn, String price, String authorName, String authorMail) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.author = new Author(authorName, authorMail);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthorName() {
		return author.authorName;
	}

	public void setAuthorName(String authorName) {
		this.author.authorName = authorName;
	}

	public String getAuthorMail() {
		return author.authorMail;
	}

	public void setAuthorMail(String authorMail) {
		this.author.authorMail = authorMail;
	}
	
	public String toXml() {
		String autor = tag("author", tag("name", author.authorName)+ tag("mail",author.authorMail));
		
		String book = tag("book",tag("title",title)+
								 tag("isbn",isbn)+
								 tag("price",price)+ 
								 autor );
		
		return book;
	}
	
	private String tag(String element, String content) {
		return String.format("<%1$s>%2$s</%1$s>", element, content);
	}
}




















