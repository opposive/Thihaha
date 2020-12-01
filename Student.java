package Inheritance;

public class Student extends Universal {

	//two type of inheritance extends and implement
	//in extends the second class is parent
	//when extends the two class become is a relationship
	//in above Person is parent class and relationship between Student and Person is "is a" relationship its mean Student is a Person relationship
	//there is a super() default constructor in every constructor and that super constructor represent the constructor of the parent class
	// in this example super() constructor represent the universal class's default constructor
	//and Universal class has parent class call Person
	
	String rollNo;
	String school;
	String phone;
	
	Student(){
		System.out.println("No arg");
	}
	
	public Student(String rollNo) {
		this();
		this.rollNo = rollNo;
		System.out.println("1 arg");
	}
	
	public Student(String rollNo, String school) {
		//if calling this constructor cannot call super() constructor
		this(rollNo);
		this.rollNo = rollNo;
		this.school = school;
		System.out.println("2 args");
	}
	
	public Student(String rollNo,String school, String phone) {
		this(rollNo,school);
		this.rollNo = rollNo;
		this.school = school;
		this.phone = phone;
		System.out.println("3 args");
	}
	
	public static void main(String[] args) {
		
	}
	
	public void show() {
		
	}
	
	@Override
	public void talk() {
		System.out.println("Student talk");
	}

	/*public Student(String name) {
		//all the class derived from class name object
		//super() is default constructor
		super();
		System.out.println(getClass());
		this.name = name;
	}*/
	
}
