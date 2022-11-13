package assignment;

import java.util.Scanner;

// Write a program to check it is even or odd and palindrome or not!!!
public class evenoddpalindrome {
	public static void main (String args[])
	{
		int original;
		int reverse=0;
		Scanner i = new Scanner(System.in);
		System.out.println("enter a number=");
		original=i.nextInt();
		if(original%2==0)
			System.out.println(+original +  "is a evennumber");
		else
			System.out.println(+original +  " is a odd number");
		
			int temp=original;
		    while(temp!=0)
			{
				int digit=temp%10;
				 temp=temp/10;
				 reverse=reverse*10+digit;
			}
				if(reverse==original)
				{
					System.out.println( original +"  is a palindrome number");
				}
				else
				{
					System.out.println( original +"  is NOT a palindrome number ");
				}
			}
	}


