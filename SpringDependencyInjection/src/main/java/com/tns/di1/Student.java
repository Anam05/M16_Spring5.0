package com.tns.di1;

public class Student {
	
	//dependency in terms of objects
	MathCheat m;
	
	public void setM(MathCheat m) {
		this.m = m;
	}

	public void cheating()
	{
		m.mathcheat();
	}

}
