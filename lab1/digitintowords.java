package lab1;

import java.util.Scanner;

public class digitintowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter any number");
		int n=obj.nextInt();
		int temp=n;
		int i=0;
		int a[]=new int[10];
		
		for(;temp!=0;i++)
		{
			digit=temp%10;
			temp=temp/10;
			a[i]=digit;
		}
			System.out.println("splitting the integer into words ");
		for(int j=i-1;j>=0;j--)
		{
			switch(a[j])
			{ 
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			default:
				System.out.println("zero");
			    break; 
				
			
			}
		}
	}


}