package hello;
public class Activity5{
public static void main(String[] args) {
	String title="Abstract class Activity";
	Book newNovel=new Mybook();
	newNovel.setTitle(title);
	System.out.println("Title: "+newNovel.getTitle(title));
}
}