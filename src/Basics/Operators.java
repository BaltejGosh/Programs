package Basics;

public class Operators {
	public static void main(String [] ars)
	{
		//airthmetic operator
		int a =100;
		int b =50;
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);
		
		System.out.println(a++);//print and then increase. so a became =101
		System.out.println(++a);// first increment then print a =102
		System.out.println(a--);//first print then increment. 102  then a  =101
		System.out.println(a);
		
		//+= a+b
		int c =b;
		c +=3;;
	//	System.out.println(c);
		System.out.println(c);
		
		System.out.println(a==b);//Comparison operators.
		System.out.println(a!=b);
		System.out.println(a>b && a>c);
		
		
		
	}

}
