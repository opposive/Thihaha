package Inheritance;

public class Person {

	//can access from everywhere
	public String pvar = "public var";
	//can access from class which is in same package 
	String dvar = "default var";
	//can access from class which is in same package and inherited classes
	protected String ptvar = "protected var";
	//can't access from other classes
	private String pvvar = "private var";
	
	private String nrcNo;
	
	public Person() {
		//System.out.println("Person");
	}
	
	
	
	public String getNrcNo() {
		return nrcNo;
	}



	public void setNrcNo(String nrcNo) {
		this.nrcNo = nrcNo;
	}



	public Person(String name) {
		
	}
	
	public void talk() {
		System.out.println("Person talking");
	}



	public String getPvvar() {
		return pvvar;
	}



	public void setPvvar(String pvvar) {
		this.pvvar = pvvar;
	}
	
}
