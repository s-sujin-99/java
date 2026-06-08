package chapter07.page09;

public class BookClass {
	private String title;
	private String publicher;
	private String author;
	private int price;
	private double discountRate;
	private int count;
	
	String[] info;
	
	public BookClass() {}
	public BookClass(String title,String publicher,
			String author,int price,double discountRate) {
		this.title = title;
		this.publicher = publicher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		this.info = new String[3];
		this.count = 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublicher() {
		return publicher;
	}
	public void setPublicher(String publicher) {
		this.publicher = publicher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public int getCount() {
		return count;
	}
	
	public String[] getInfo() {
		return info;
	}
	public void setInfo(String[] info) {
		this.info = info;
	}
	public void addInform(String book1) {
		// 문자열 배열에 
		if (count >= 3) {
			System.out.println("더이상 추가할 수 없습니다.");
		}
		info[count++] = book1;	
	}
	@Override
	public String toString() {
		return "BookClass [title=" + title + ", publicher=" + publicher + ", author=" + author + ", price=" + price
				+ ", discountRate=" + discountRate + "]";
	}
	
	
}
