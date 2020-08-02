package lab1;

import java.util.Scanner;

public class harmonicseries {
public static void main(String arg[])
{
System.out.println("enter any number");
Scanner s =new Scanner(System.in);
int num=s.nextInt();

double result=0.0;
while(num>0)
{
	result=result+(double)1/num;
	num--;
}
System.out.println("output"+result);
}
}
