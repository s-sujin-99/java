package chaper06.page00;

import java.util.Scanner;

public class TestJava {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 세명의 학생의 정보를 입력받는다.
		// 이름 국영수 점수 
		// 세명의 학생 정보와 총점
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		
		//세명의 정보 입력 받고 배열 저장
		for (int i = 0; i < 3; i++) {
			
			System.out.printf((i+1)+" name : ");
			name[i] = sc.nextLine();
			
			System.out.printf(" kor : ");
			kor[i] = Integer.parseInt(sc.nextLine());
			
			System.out.printf(" eng : ");
			eng[i] = Integer.parseInt(sc.nextLine());
			
			System.out.printf(" math : ");
			math[i] = Integer.parseInt(sc.nextLine());
			
			//함수를 통해 총합 구하기
			total[i] = totalFun(kor[i], eng[i], math[i]);
//			total[i] = kor[i] + eng[i] + math[i];
			
		}
		for (int i = 0; i < 3; i++) {						
			System.out.printf((i+1)+"\nname : %s\nkor : %d\neng : %d\nmath : %d\ntotal : %d\n"
					,name[i],kor[i],eng[i],math[i],total[i]);
		}
		
		
		if (sc != null) {
			sc.close();
		}
		System.out.println("The end.");
		
				
	}
	private static int totalFun(int kor, int eng, int math) {
		// 세과목 점수 총합을 계산하는 함수
		int sum = kor + eng + math;
		return sum;
	}

}
