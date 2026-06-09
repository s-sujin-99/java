package chapter13.page21;

public class Run {

	public static void main(String[] args) {
		// 클릭했을때 음악 재생
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.onClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("음악 재생");
			}
		});
		
		btn1.click();
		
		// 클랙했을때 네이버 접속
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.onClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("네이버 접속");
			}
		});
		
		btn2.click();

	}

}
