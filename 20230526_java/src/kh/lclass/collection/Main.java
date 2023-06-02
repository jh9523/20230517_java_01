package kh.lclass.collection;

import kh.lclass.oop.sample.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new TestCollection().testArrayList();
//		new TestCollection().testHashset();
//		new TestCollection().testHashMap();
//		new TestCollection().testStack();
		TestCollection tc = new TestCollection();
		String str = tc.testGeneric(35.5, 30);
		System.out.println(str);
		str = tc.testGeneric(2, "안녕");
		System.out.println(str);
		str = tc.testGeneric(22222L, new Car(300));
		System.out.println(str);
		
	}

}
