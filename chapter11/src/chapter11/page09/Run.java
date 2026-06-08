package chapter11.page09;


public class Run {

	public static void main(String[] args) {
		//다형성 구현 
		Animal[] animalArr = new Animal[] {new Cat(), new Dog()};
		
		for (int i = 0; i < animalArr.length; i++) {
			animalArr[i].cry();
		}
		
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
