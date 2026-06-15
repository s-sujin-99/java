package chapter16.page03;

public class Run {

	public static void main(String[] args) {
		// Goods1 Goods2 
		// Goods1은 Apple만 사용 가능
		Goods1 goods1 = new Goods1(new Apple());
		Apple apple = goods1.getApple();
		goods1.setApple(apple);
		
		System.out.println();
		
		Goods2 goods2 = new Goods2(new Pencil());
		Pencil pencil = goods2.getPencil();
		goods2.setPencil(pencil);
		
		//Goods =====================================
		//Object 타입으로 대표적인 한클레스만 생성
		//다운캐스팅을 필수적으로 해야한다.
		// Goods => Apple, Pencil 넣어서 사용
		Goods goods11 = new Goods(new Apple());
		// 문제점 반드시 downCasting을 해야함
		Apple apple2 = (Apple)goods11.getObject();
		
		goods11.setObject(apple2);
		
		Goods goods22 = new Goods(new Pencil());
		Pencil pencil2 = (Pencil)goods22.getObject(); 
		
		goods22.setObject(pencil2);
		
		//MyClass =====================================
		MyClass<Apple> mcA = new MyClass<Apple>(new Apple());
		Apple apple3 = mcA.getT();
		mcA.setT(apple3);
		
		MyClass<Pencil> mcP = new MyClass<Pencil>(new Pencil());
		Pencil pencil3 = mcP.getT();
		mcP.setT(pencil3);
		
		//MyClass2 =====================================
		MyClass2<Apple, Pencil> product1 = new MyClass2<Apple, Pencil>(new Apple(), new Pencil());
		Apple apple4 = product1.getT();
		Pencil pencil4 = product1.getS();
		
		product1.setT(apple4);
		product1.setS(pencil4);
		
	}

}
