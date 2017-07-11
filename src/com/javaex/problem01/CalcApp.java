package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		boolean i = true;

		Scanner sc = new Scanner(System.in);

		Add add = new Add();
		Div div = new Div();
		Mul mul = new Mul();
		Sub sub = new Sub();

		while (i) {

			System.out.print(">>");
			String str = sc.nextLine();
			String[] value = str.split("\\s");

			int a = Integer.parseInt(value[0]);
			int b = Integer.parseInt(value[2]);
			

			if (value[1].equals("+")) {

				add.setValue(a, b);
				System.out.println(">>" + add.calculate());

			}

			else if (value[1].equals("-")) {

				add.setValue(a, b);
				System.out.println(">>" + sub.calculate());

			}

			else if (value[1].equals("*")) {

				add.setValue(a, b);
				System.out.println(">>" + mul.calculate());

			}

			else if (value[1].equals("/")) {

				add.setValue(a, b);
				System.out.println(">>" + div.calculate());

			} else {
				System.out.println("알 수 없는 연산입니다.");
				i = false;
			}
		}

		sc.close();
	}
}
