package ProgrammingNumberSeries;

import java.util.Scanner;

public class ToCheckGivenNumberAsPalindrom {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	int n=scr.nextInt(),digit=0,temp=n,rev=0;
	while(n>0){
	digit=n%10;
	rev=(rev*10)+digit;
	n=n/10;
	}
	System.out.println((rev==temp)?+rev + " "+"number is palindrom":"not palindrom");
}
}
