package chapter14.page27;

public class MyRunTimeException extends RuntimeException{
	private String messege;
	
	public MyRunTimeException() {
		this(null);
	}

	public MyRunTimeException(String messege) {
		super(messege);
		this.messege = messege;
	}
	
	
}
