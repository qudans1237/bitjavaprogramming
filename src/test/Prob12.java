package test;

public class Prob12 {

	private String title;
	private int price;

	public Prob12() {
	}

	public Prob12(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class BookMgr {

	Prob12[] booker = new Prob12[5];

	public BookMgr(Prob12[] booklist) {
		this.booker = booklist;
	}

	public void printBooklist() {
		for (int i = 0; i < booker.length; i++) {
			System.out.println(booker[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < booker.length; i++) {
			sum += booker[i].getPrice();
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		Prob12[] booklist = new Prob12[5];

		Prob12 book1 = new Prob12("Java Program", 25000);
		Prob12 book2 = new Prob12("JSP Program", 15000);
		Prob12 book3 = new Prob12("SQL Fundamentals", 30000);
		Prob12 book4 = new Prob12("JDBC Program", 28000);
		Prob12 book5 = new Prob12("EJB Program", 34000);

		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;

		BookMgr mgr = new BookMgr(booklist);

		System.out.println("===책목록===");
		mgr.printBooklist();
		System.out.println("");

		System.out.println("===책 가격 총합 ===");
		mgr.printTotalPrice();
	}
}
