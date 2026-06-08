package chapter09.pratice06;

import java.util.Scanner;

public class Run {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 메뉴 만들기
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1.요리 재료 \n2.한글 랜덤 \n3. exit");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				Practice1();
				break;
			case 2:
//				String str = randomString(0,0);
//				System.out.printf("랜덤으로 만든 문자열 : %s\n",str);
				break;
			case 3:
				System.out.println("프로그램 종료");
				exitBtn = true;
				break;
			default:
				System.out.println("없는 번호입니다.");
				break;
			}
		}

		if (sc != null) {
			System.out.println("The end.");
			sc.close();
		}
	}



	public static void Practice1() {
		System.out.println("레시피 주제 입력 : ");
		String recipeName = sc.nextLine();
		// 요리 재료
		Recipe recipe = new Recipe(recipeName);
		// 재료 제공 5번
		for (int i = 0; i < 5; i++) {
			if(recipe.getIngredientCount() >= 5) {
				System.out.println("레시피 입력 완료");
				break;
			}
			//재료를 입력하는 함수
			recipe.addIngrediendt(randomString(3,7));
		}
		//요리 step 함수
		for (int i = 0; i < 5; i++) {
			if(recipe.getStepCount() >= 5) {
				break;
			}
			//재료를 입력하는 함수
			recipe.addStep(randomString(10,20));
		}
		System.out.printf("레시피출력 : %s \n",recipe.toString());
	}

	public static String randomString(int start, int end) {
		
//        String str = "";
//        // 3~7사이 랜덤
//        int length = (int)(Math.random() * (7-3+1)+3);
//        for( int i = 0; i < length; i++) {
//            //문자열 -> unicode구성 -> 한글 범위(44032 ~ 55203)
//        	str += (char)((int)(Math.random()*(55203-44032+1) +44032));
//        }
//
//        return str;
		
		String str = "";
	    int length = (int)(Math.random() * (end - start + 1) + start); // 3~7자
	    
	    for(int i = 0; i < length; i++) {
	        // 44032(가)부터 시작해서 받침이 없는 글자들만 골라내는 공식 (28자 단위로 끊어짐)
	        int num = (int)(Math.random() * 399); // 받침 없는 글자의 대략적인 개수 범위
	        char ch = (char)(44032 + (num * 28));
	        str += ch;
	    }

	    return str;
	}
	

}
