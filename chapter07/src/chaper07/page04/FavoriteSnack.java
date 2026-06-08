package chaper07.page04;

public class FavoriteSnack {
	//멤버 변수
	String candy;
	String jelly;
	String chocolate;
	
	// 생성자
	public FavoriteSnack(String candy, String jelly, String chocolate) {
		this.candy = candy;
		this.jelly = jelly;
		this.chocolate = chocolate;
	}
	
	//get set
	public String getCandy() {
		return candy;
	}
	public void setCandy(String candy) {
		this.candy = candy;
	}
	public String getJelly() {
		return jelly;
	}
	public void setJelly(String jelly) {
		this.jelly = jelly;
	}
	public String getChocolate() {
		return chocolate;
	}
	public void setChocolate(String chocolate) {
		this.chocolate = chocolate;
	}
	
	//기능
	void buyCandy() {
		System.out.printf("나는 %s를 좋아해서 사탕을 샀다.\n", candy);
	}
	void buyJelly() {
		System.out.printf("나는 %s를 좋아해서 젤리를 샀다.\n", jelly);
	}
	void buyChocolate() {
		System.out.printf("나는 %s를 좋아해서 초콜릿을 샀다.\n", chocolate);
	}
	
	//출력
	void FavoritePrint() {
		System.out.printf("나는 사탕 중 %s를 좋아하고,\n젤리 중 %s를 좋아하고,\n초콜릿 중 %s를 좋아한다.",candy ,jelly, chocolate);
	}
}
