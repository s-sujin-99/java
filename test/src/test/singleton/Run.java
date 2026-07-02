package test.singleton;

public class Run {

	public static void main(String[] args) {
		//싱글톤을 이용해서 객체 생성 후 활용
		SingleTon singleTon1 = SingleTon.getSingleTon();
		
		singleTon1.print();
		String userName = singleTon1.name("kdj");
		System.out.println(userName);
	}

}
