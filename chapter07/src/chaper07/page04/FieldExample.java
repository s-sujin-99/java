package chaper07.page04;

public class FieldExample {
	String cat;
	String dog;
	
	public FieldExample(String cat, String dog) {
		this.cat = cat;
		this.dog = dog;
	}
	
	void work1() {
		String cow = "음머";
		System.out.println(cow);
		work2("귀뚤");
	}
	
	void work2(String i) {
		String frog = "개굴개굴";
		System.out.println(i+frog);
	}

	// 지역변수는 값을 줘야한다.
	public void work3() {
		int k = 10;
		System.out.println(" 지역변수 k : " + k);
	}
	
	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	
}
