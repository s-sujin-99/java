package chaper06.page10;

public class Car {
	//멤버 변수
	String color;
	int price;
	int mfg;
	String name;
	
	//생성자
	public Car(String color, int price, int mfg, String name) {
		this.color = color;
		this.price = price;
		this.mfg = mfg;
		this.name = name;
	}
	
	
	//멤버 함수
	public void drive() {
		System.out.printf("색상이 %s인 %s 차를 운전 시작\n", this.color, this.name);
	}
	

	//setter 함수
	public void setColor(String color) {
		if(color == null || color.equals("")) {
			System.out.println("다시 입력하세요.");
			return;
		}
		this.color = color;
	}

	//getter 함수
	public String getColor() {
		return color;
	}


	public void end() {
		System.out.println("운전 끝~~");
	}
	
	public void carPrint() {
		System.out.println("=================");
		System.out.printf("자동차 색깔 : %s\n자동차 가격 : %d\n제조연도 : %-10d\n자동차 이름 : %s\n",this.color,this.price,this.mfg,this.name);
		System.out.println("=================");
	}


	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", mfg=" + mfg + ", name=" + name + "]";
	}
	
	
}
