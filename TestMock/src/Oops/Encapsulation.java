package Oops;

import java.util.Scanner;

public class Encapsulation {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scr.next();
		System.out.println("Enter the id");
		int id=scr.nextInt();
		
//	JavaBean jb=new JavaBean("smita",90);
//	jb.setName(name);
//	jb.setId(id);
//	
	JavaBean jb1=new JavaBean();
	jb1.setName(name);
	jb1.setId(id);
	
	
	System.out.println(jb1.getId());
	System.out.println(jb1.getName());
	}
}