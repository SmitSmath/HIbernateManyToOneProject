package ProgrammingNumberSeries;

import java.util.Scanner;

public class ReverseString {
	static String s2=" ",s1;
public static void main(String[] args) {
	
	Scanner scr=new Scanner(System.in);
	System.out.println("enter a string");
	 s1=scr.nextLine();
	 ReverseString rs=new ReverseString();
	rs.ReverseStringLogic();
	
	
	
}

public void ReverseStringLogic(){
	
	int n=s1.length();
	for(int i=n-1;i>=0;i--){
	s2=s2+s1.charAt(i);	
	
}
	System.out.println(s2);
}
}