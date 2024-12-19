package hello;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	public String getTitle(String title) {
		return title;
	}
}
class Mybook extends Book {
	public void setTitle(String s) {
		 title=s;
	}
}