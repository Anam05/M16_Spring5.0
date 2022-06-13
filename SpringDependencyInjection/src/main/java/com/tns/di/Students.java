package com.tns.di;

public class Students {

//DI in terms of literals
	private String Name;
	private int id;
	// DI using constructors
	public Students(String name, int id) {
		super();
		Name = name;
		this.id = id;
	}

	// DI using setters method
	/*public void setName(String name) {
		Name = name;
	}

public void setId(int id) {
		this.id = id;
	}
*/

public void print()
{
System.out.println("Student name is " +Name);
System.out.println("Student name is " +id);
}


}