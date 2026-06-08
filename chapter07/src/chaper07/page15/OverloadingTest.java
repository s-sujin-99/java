package chaper07.page15;

public class OverloadingTest {
	String email;
	String password;
	int no;
	public OverloadingTest(String email, String password, int no) {
		this.email = email;
		this.password = password;
		this.no = no;
	}
	public static void userInfo(String email, String password) {
		System.out.printf("아이디 : %s\n비밀번호 : %s",email,password);
	}
	public static void userInfo(int no, String email) {
		System.out.printf("%d번째 아이디 : %s",no, email);
	}
	public static void userInfo(String password) {
		System.out.printf("비밀번호 : %s", password);
	}
}
