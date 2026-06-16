package movie.run;

import java.util.Scanner;

import movie.view.MovieMenu;

public class Run {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. 영화\n2. 영화 예매\n3. 회원관리\n4. 관리자\n5. 게시판\n6. exit");
			System.out.println(">>");
			int no = Integer.parseInt(Run.sc.nextLine());

			switch (no) {
			case 1:
				MovieMenu menu = new MovieMenu();
				menu.DisplayMenu();
				break;
			case 2:
				System.out.println("서비스 준비중");
				break;
			case 3:
				System.out.println("서비스 준비중");
				break;
			case 4:
				System.out.println("서비스 준비중");
				break;
			case 5:
				System.out.println("서비스 준비중");
				break;
			case 6:
				exitBtn = true;
				break;

			default:
				break;
			}
		}
		if (sc != null) {
			sc.close();
		}
	
	}

}
