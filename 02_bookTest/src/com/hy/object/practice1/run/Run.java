package com.hy.object.practice1.run;

import com.hy.object.practice1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		//핸드폰 정보 출력
		Product proList1 = new Product("아이폰16", 1000000, "애플");
		Product proList2 = new Product("갤럭시 s25", 1350000, "삼성");

		proList1.infomation();
		proList2.infomation();
	}

}
