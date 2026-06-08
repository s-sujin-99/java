package chapter12.page21;


public class Run {

	public static void main(String[] args) {
		//다형성 구현 
		Animal[] animalArr = new Animal[] {new Cat(), new Dog()};
		
		for (int i = 0; i < animalArr.length; i++) {
			animalArr[i].cry();
		}
		
		System.out.println(Animal.PRICE);
		
		Animal a1 = new Dog();
		
		//downCasting
		Dog d1 = (Dog)a1;
		System.out.println(d1.m);
		Animal animal = new Animal() {
			
			@Override
			public void cry() {
				// TODO Auto-generated method stub
				System.out.println("익명 이너 클리스 : 참새는 짹짹");
			}
		};
		animal.cry();
	}

}
