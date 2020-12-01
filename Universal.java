package Inheritance;

public class Universal extends Person {
	
	private int uniquenumber;
	
	public int getUniquenumber() {
		return uniquenumber;
	}

	public void setUniquenumber(int uniquenumber) {
		this.uniquenumber = uniquenumber;
	}

	public Universal(){
		//System.out.println("Universal");
	}
	
	
	//@Override is check if the method under is overrided method or not if not override method then cause error
	@Override
	public void talk() {
		System.out.println("Universal talking");
	}
	

}