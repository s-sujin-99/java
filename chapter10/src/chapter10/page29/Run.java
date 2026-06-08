package chapter10.page29;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Boob bo1 = new Boob();
		bo1.boob();
		
		Boob[] boobArr = new Boob[] {new Car(), new Tree(), new House(), new Building()};
		
		for (int i = 0; i < boobArr.length; i++) {
			boobArr[i].boob();
//			Thread.sleep(1000);
		}
		//멤버 변수
		Boob bo2 = new House();

		System.out.println(((House)bo2).m);  // downCasting
		bo2.boob();
		
		
		Boob bo3 = new Boob();
		System.out.println(bo3.sm);
		System.out.println(Boob.sm);
	
		
		House h1 = new House();
		System.out.println("==============");
		System.out.println(h1.sm);
		System.out.println(House.sm);
		
		System.out.println("==============");
		Boob.sBoob();
		House.sBoob();
		
		((House)bo2).sBoob();
		
	}

}
