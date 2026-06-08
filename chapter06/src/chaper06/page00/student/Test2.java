package chaper06.page00.student;

public class Test2 {

	//멤버 변수
	int width;
	int height;
	int area;
	
	//매개변수 생성자
	Test2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//기능 함수
	void areaCalculate() {
		area = width * height ;
	}
	
	//기능함수
	void areaPrint() {
		System.out.printf("가로 : %-5d 세로 : %-5d 면적 : %-10d\n",width,height,area);
	}
}
