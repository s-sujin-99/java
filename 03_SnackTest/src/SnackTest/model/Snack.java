package SnackTest.model;

import java.util.Arrays;

public class Snack {
	private String name;
	private String flavor;
//	private int quantity;

	Snack(){}
	
	Snack(String name,String flavor){
		this.name = name;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void eatSnack() {
		System.out.printf("나는 %s를 좋아해서 먹었다\n", name);
	}

	@Override
	public String toString() {
		return "Snack [name=" + name + ", flavor=" + flavor + "]";
	}
	
	

}
