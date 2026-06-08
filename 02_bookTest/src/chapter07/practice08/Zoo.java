package chapter07.practice08;

import java.util.Arrays;

public class Zoo {
	// 멤버 변수
	private static final int COUNT = 5;
	private String name;
	private String location;
	private String[] animals;
	private int animalCount;

	// 생성자
	public Zoo() {
		this.animals = new String[COUNT];
		this.animalCount = 0;
	}

	public Zoo(String name, String location) {
		this.name = name;
		this.location = location;
		this.animals = new String[COUNT];
		this.animalCount = 0;
	}

	// 멤버함수 get, set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getAnimals() {
		return animals;
	}

	public void setAnimals(String[] animals) {
		this.animals = animals;
	}
	
	public int getAnimalCount() {
		return animalCount;
	}

	// 멤버함수 기능
	public int addAnimal(String animalName) {
		// 문자열 배열에 동물 이름 추가
		if (animalCount >= 5) {
			System.out.println("더이상 추가할 수 없습니다.");
			return -1;
		}
		animals[animalCount++] = animalName;
		return animalCount;
	}

	// 멤버함수 출력
	@Override
	public String toString() {
		return "Zoo [name=" + name + ", location=" + location + ", animals=" + Arrays.toString(animals)
				+ ", animalCount=" + animalCount + "]";
	}

	

	

}
