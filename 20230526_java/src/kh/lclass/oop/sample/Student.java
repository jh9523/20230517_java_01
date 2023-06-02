package kh.lclass.oop.sample;

// class 예약어키워드 abstract는 해당 클래스 내에 abstract메소드가 0개 이상 있을 것이라는 것을 의미함.


public final /*abstract*/ class Student extends Person {
	private String name;	// 학생증용 이름
//	private int age;
//	private char gender;
	private int score;
	private int grade;
	private final int maxCount = 10;
	
	// MVC Model View Controller
	
	
	public Student() {
		super("김말똥", 22, '남');
	}
	
	public Student(String name, char gender, int age, int grade) {
		super(name, age, gender);
		this.name = name;
		this.grade =grade;
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade + ", toString()=" + super.toString()
				+ "]";
	}


	@Override
	public String getName() {
//		return super.getName();	// 보모의 이름
		return this.name;	// 학생증용 이름
	}
	
	
//	@Override
	// Overriding
	// 재정의 - 
	// 조건 :
	// 상속한 클래스의 메소드와
	// 동일한 메소드명
	// 매개변수 자료형, 개수 동일
	// 리턴타입 동일
	// 단 접근제한자는 달라도 됨 부모 메소드의 접근제하자보다 넓은 범위 접근제한자를 사용해야한다.
	public int getAge() {
		return super.getAge()+1;
	}



	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getGrade() {
		return grade;
	}


	// 변수 선언
	// 메소드 정의		// 이 기능은 이런이런이런 기능으로 되어있어..
	// 메소드 선언		// 이 기능이 있을거야. 있어야해.
	public /*abstract*/ void setGrade(int grade)	{
		this.grade = grade;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	
	
	
}
