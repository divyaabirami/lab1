package lab1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int a,n,x;
		int s=0;
		Scanner obj=new Scanner(System.in);
		 n =obj.nextInt();
		 a=n;
		while(n!=0)
		{
			x=n%10;
			s=(s*10)+x;
			n=n/10;
		}
		
	if( a==s)
	{
		System.out.println(a+"is a palindrome");
	}
	else
	{
		System.out.println(a+"is not a palindrome");
	}

	}

}
