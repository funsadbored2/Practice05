package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		List<Friend> friend = new ArrayList<Friend>();
		Friend p = new Friend();
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해주세요");
		
		for (int i = 0; i < 3; i++) {

			String[] info = sc.nextLine().split("\\s");
			
			p.setName(info[0]);
			p.setHp(info[1]);
			p.setSchool(info[2]);

			friend.add(p);
			
		}

		for (Friend f : friend) {
			
			System.out.println("이름:"+f.getName()+" 전화번호:"+f.getHp()+" 학교:"+f.getSchool());

		}
		sc.close();
	}

}
