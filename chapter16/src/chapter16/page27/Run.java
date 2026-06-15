package chapter16.page27;

public class Run {

	public static void main(String[] args) {

		Parent parent1 = new Parent();
		parent1.method("안녕 나는 부모");
		
		Child child1 = new Child();
		child1.method("안녕 나는 자식 ");
	}

}
