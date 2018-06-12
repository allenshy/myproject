package com.allen;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		System.out.println("你今年幾歲:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 12) {
			System.out.println("小屁孩");

		}else {
			System.out.println("大屁孩");
		}
	}

}
