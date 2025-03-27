package UsingBeans;

public class Student {
	
	  String name;
	  int id;
	  String branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	  public void display() {
		  System.out.println("hello my name is"+name+"i am coming from"+branch+"my id is"+id);
	  }

}
