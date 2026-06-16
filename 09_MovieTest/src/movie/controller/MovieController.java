package movie.controller;

import movie.model.Movie;

public class MovieController {
	private Movie[] mArr;
	private static int COUNT;
	private static int CUT_LINE;
	
	static {
		COUNT = 5;
		CUT_LINE = 50;
	}
	
	public MovieController() {
		mArr = new Movie[COUNT];
		mArr[0] = new Movie("오징어 게임2", "스릴러", 85);
		mArr[1] = new Movie("기생충", "드라마", 45);
		mArr[2] = new Movie("범죄 도시5", "액션", 25);
		mArr[3] = new Movie("무빙2", "히어로", 60);
		mArr[4] = new Movie("올드보이", "스릴러", 15);
	}
	
	public Movie[] printMovie() {
		return mArr;
	}
	
	public int sumWatchTime() {
		int sum =0;
		for (int i = 0; i < mArr.length; i++) {
			sum += mArr[i].getWatchTime();
		}
		return sum;
	}
	
	public double[] avgWatchTime() {
		double[] avgTime = new double[2];
		avgTime[0] = this.sumWatchTime();
		avgTime[1] = this.sumWatchTime() / COUNT;
		
		return avgTime;
	}
	
	public String[] getFamousMovie() {
		String[] isFamous = new String[mArr.length];
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i].getWatchTime() > CUT_LINE) {
				isFamous[i] = "메가 히트작";
			} else {
				isFamous[i] = "일반 콘텐츠";
			}
		}
		return isFamous;
	}
	
	public Movie[] getSortCount() {
		Movie[] nmArr = new Movie[COUNT];
		for (int i = 0; i < mArr.length; i++) {
			nmArr[i] = new Movie(mArr[i]);
		}
		
		for (int i = 0; i < nmArr.length; i++) {
			for (int j = i+1; j < nmArr.length-1; j++) {
				if (nmArr[i].getWatchTime() < nmArr[j].getWatchTime()) {
					Movie buffer = nmArr[i];
					nmArr[i] = nmArr[j];
					nmArr[j] = buffer;
				}
				
			}
			
		}
		return nmArr;
	}
	
	public String searchMovie(String name) {
		String findMovie = null;
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i].getTitle().equals(name)) {
				findMovie = mArr[i].toString();
			}
		}
		return (findMovie != null) ? findMovie : null;
	}
}
