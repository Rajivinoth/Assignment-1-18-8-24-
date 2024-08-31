package week1.assessment2;

public class FindFibonacciSeries {
	public static void main(String[]args) {
		
int n1=0,n2=1,n3,i,count=8;

System.out.println(n1);//printing 0 
System.out.println(n2);//printing 1
for(i=2;i<count;++i)//loop starts form 2
{
	n3=n1+n2;
	System.out.println(""+n3);;
	n1=n2;
	n2=n3;
	
}
}
}
