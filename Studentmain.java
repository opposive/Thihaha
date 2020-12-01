package Inheritance;

import avstrac.Animal;
import avstrac.Hippo;

public class Studentmain {

	public static void main(String[] args) {	
		// when object create there is no constructor in that object's class than generate default constructor by compiler
		//in eclipse compiler is running while writing code
		//Student stu = new Student();
		//in java there is 2 type of memory
		//stack and heap
		// stack is like a basket if we are adding plate in basket the first plate we add can get out as the last one from basket
		//variables and methods are run on stack and objects are run on heap
		//new Student("","");
		// two type of casting ,casting make my jvm is implicit casting( another name is up casting)
		//casting make by dev is explicit casting
		//if we declare with static than that method or variable are the only one method or variable from start of the application to end of application
		
		Person p = new Student();//implicit casting
		
		p.talk();//talk method from Person
		
		((Student)p).talk();//talk method from Student
		
		//if create object like above than in compile time we can see method in Person class and see universal method in runtime
		// so that it means we can use override methods from universal class
		// if we create object of parent in type of child then we have to make Explicit(downcasting) because jvm cannot cast it
		//java didn't allow multiple inheritance
		Student s = (Student)p;//Explicit casting (downcating)
		
		Animal ani = new Hippo();
		ani.eat();
		
		Animal a = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("Eating soemthing");
			}
		};
		
		new Animal() {
			
			@Override
			public void eat() {
				System.out.println("skaal");	
			}
		}.eat();
		
		a.eat();
		
		p = new Universal();
		if(p instanceof Student) {
			Student ss= (Student)p;
			ss.talk();
		}else{
			s.talk();
		}
		
		System.out.println(p);
		//sSystem.out.println(ss instanceof Student);
	}
}