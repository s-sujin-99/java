package signUpTest.model.member;

public class Member {
	private String id;
	private String password;
	private String name;
	private String phoneNum;
	private String[] members;
	private int count;

	Member() {
		super();
		members = new String[5];
		this.count = 0;
	}

	Member(String id, String password, String name, String phoneNum) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNum = phoneNum;
		members = new String[5];
		this.count = 0;
	}
	

	public void setId(String id) {
		this.id = id;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}



	public String getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getPhoneNum() {
		return phoneNum;
	}

	public void addMembers(String member) {
		if(this.count >= 5) {
			System.out.println("더이상 추가 할 수 없습니다.");
		}
		members[count++] = member;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (oldPassword.equals(this.password)) {
			oldPassword = newPassword;
			System.out.printf("%s님, 비밀번호가 정상적으로 변경되었습니다.", this.name);
		}
	}

	public void changePhoNumber(String newPhoneNum) {
		this.phoneNum = newPhoneNum;
		System.out.printf("%s님, 전화번호가 %s(으)로 변경되었습니다.\n",this.name, newPhoneNum);
	}


	@Override
	public String toString() {
		return "===========회원정보==========\n id: " + id + "\n name: " + name + "\n phoneNum: " + phoneNum + "\n==========================";
	}
	
	

}
