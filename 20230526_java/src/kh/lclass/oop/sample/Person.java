package kh.lclass.oop.sample;

public class Person {
	
	private String name;	// 주민등록상 이름
	private int age;
	private char gender;
	
	public Person() {}
	public  Person(String name, int age, char gender) {
		super();
		this.name= name;
		this.age= age;
		this.gender=gender;
	}
	
	// allArgumentsConstructor 란 모든 매개인자를 받아서 처리하는 생성자
	// overloading으로 생성자
	
	 int getAge() {
		// 만나이
		return age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;	// 남 여
	}
	
	

}
