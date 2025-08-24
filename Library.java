

public class Library 
{
     
	private String libraryName;
	private String location;
	private Book book;
	public Library(String libraryName, String location, String title,String author) {
		super();
		this.libraryName = libraryName;
		this.location = location;
		this.book = new Book(title, author);
	}
	public String toString()
	{
		return "Library Name : "+this.libraryName+", Library Location : "+this.location+", Book Data : "+this.book+"";
	}
	
	
	
	
}
