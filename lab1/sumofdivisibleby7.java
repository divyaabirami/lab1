package lab1;

public class sumofdivisibleby7 {

	public static void main(String[] args) {
		int sum=0;
		int i;
		int n;
	for( i=100;i<=200;i++)
	{
		 n=i %7;
		if(n==0)
		{
          sum=sum+i;
		}

	}
System.out.println("sum of number that is divisible by 7 between 100 and 200="+sum);
}
}
