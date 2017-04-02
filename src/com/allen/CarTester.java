package com.allen;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("lamborghini", "huracan", 5204);
		Car c2 = new Car("McLAREN", "650S", 3799);
		Car c3 = new Car("Honda", "NSX", 3493);

		int[] n = new int[5];
		System.out.println(n[2]);

		Car[] cars = new Car[3];

		System.out.println(cars[0]);

		cars[0] = new Car("lamborghini", "huracan", 5204);
		cars[1] = new Car("McLAREN", "650S", 3799);
		cars[2] = new Car("Honda", "NSX", 3493);
		cars[0].id = 834;
		cars[1].id = 937;
		cars[2].id = 982;
		System.out.println(cars[0].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
			int x = 0;
		}
		System.out.println(i);
		for (i = 1; i <= 9; i = i + 2) {
			System.out.println(i);
		}
		System.out.println(i);
		class AA {

		}
	AA a = new AA();
	}
}
