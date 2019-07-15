//Name: Yogina Maharjan

package com.yogi.human;

public class Human {
	String name;
	int age;
	double height;
	String address;
	boolean ishealthy =false;
	
	
	public String getname() {
		return name;
	}
	
	public void printAddress() {
		System.out.println("The address is " + address);
	}
	
	public int getAge() {
		return age;
	}

	public double getHeight(){
		return height;
	}
}
