package kh.lclass.oop.sample;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 이 쪽 주석은 색이 다름 (보통은 초록 여기는 파랑)
	 * java docs에 표시됨.
	 * 여기에 UID 생성날짜, 누가, 무엇때문에 작성하였는지를 남겨야 함. 
	 */
	private static final long serialVersionUID = 5289587148873536011L;
	private String name;	// 주민등록상 이름
	private int age;		// 만
	private transient char gender;	// '남'	/	'여'
	
	
	// 기본생성자
	/*녹색*/
	/***/ 			
	/**여기는 파랑 작성위치는 여기*/
	
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
