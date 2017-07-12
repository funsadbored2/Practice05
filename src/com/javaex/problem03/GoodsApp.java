package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		ArrayList<Goods> list = new ArrayList<Goods>();
		Goods goods = new Goods();

		Scanner sc = new Scanner(System.in);

		System.out.println("상품 3개를 입력해주세요.");
		for (int i = 0; i < 3; i++) {
			String a = sc.nextLine();
			String[] info = a.split("\\s");

			goods.setName(info[0]);
			goods.setPrice(Integer.parseInt(info[1]));
			goods.setCount(Integer.parseInt(info[2]));

		list.add(goods);
		
		}
		for(Goods g : list) {
			g.showInfo();
		}
		
	}

}
