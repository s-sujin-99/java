package movie.view;


import movie.controller.MovieController;
import movie.model.Movie;
import movie.run.Run;

public class MovieMenu {
	private MovieController controller;
	
	public MovieMenu() {
		controller = new MovieController();
	}
	
	public void DisplayMenu() {
		boolean exitBtn = false;
		while (!exitBtn) {
			System.out.println("1. 영화 출력\n2. 시청시간 순위 정렬 출력\n3. 메가 히트작 판별 출력\n4. 시청 통계 출력\n5. 영화 제목 검색\n6. HOME");
			System.out.println(">>");
			int no = Integer.parseInt(Run.sc.nextLine());

			switch (no) {
			case 1:
				System.out.println("========== 영화 정보 출력 ==========");
				printMovie();
				break;
			case 2:
				System.out.println("========== 시청 시간 기준 정렬 ==========");
				getSortCount();
				break;
			case 3:
				System.out.println("========== 콘텐츠 등급 판별 ==========");
				getFamousMovie();
				break;
			case 4:
				System.out.println("========== OTT 시청 통계 ==========");
				avgWatchTime();
				break;
			case 5:
				System.out.println("========== 영화 찾기 ==========");
				searchMovie();
				break;
			case 6:
				exitBtn = true;
				break;

			default:
				break;
			}
		}
	}

	private void printMovie() {
		Movie[] movies = controller.printMovie();
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
		
	}

	private void getSortCount() {
		Movie[] movies = controller.getSortCount();
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
	}

	private void getFamousMovie() {
		Movie[] moviesName = controller.printMovie();
		String[] movies = controller.getFamousMovie();
		for (int i = 0; i < movies.length; i++) {
			System.out.printf("%s는 %s입니다.\n",moviesName[i].getTitle(), movies[i]);
		}
		
	}

	private void avgWatchTime() {
		double[] sumAvgList = controller.avgWatchTime();
		System.out.printf("전체 영화 시청 시간 합계 : %.0f만 시간\n전체 영화 시청 시간 평균 : %.2f만 시간\n" ,sumAvgList[0],sumAvgList[1]);
		
	}

	private void searchMovie() {
		System.out.println("찾고 싶은 영화 제목을 입력해주세요.");
		String name = Run.sc.nextLine();
		
		String findMovie = controller.searchMovie(name);
		if (findMovie != null) {
			System.out.println("[검색 결과] "+findMovie);
		} else {
			System.out.println("찾으시는 영화는 없습니다.");
		}
		
	}
}
