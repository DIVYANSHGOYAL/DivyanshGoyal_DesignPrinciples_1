package calculator;
import java.util.*;
public class calc {
	void intro()
	{
		System.out.println("Welcome to calculator");
		System.out.println("Type the first expression with number followed by an operator "
				+ "then followed by another number and press enter");
		System.out.println("If you dont want to continue wit the calculator type off");
		System.out.println("If you want to continue with your previous output "
				+ "then simply start with an operator followed by a number");
		System.out.println("or else you can type as you did at first");
	}
	double add(double a,double b)
	{
		return(a+b);
	}
	double subtract(double a,double b)
	{
		return(a-b);
	}
	double multiply(double a,double b)
	{
		return(a*b);
	}
	double divide(double a,double b)
	{
		return(a/b);
	}
	public static void main(String args[])
	{
		calc ob=new calc();
		ob.intro();
		int i=0;String ex="",ex1="";char p=' ';double r=0,a=0,b=0;
		Scanner sc=new Scanner(System.in);
		ex1=sc.next();
		do
		{
			ex=ex1;
			for(i=0;i<ex.length();i++)
			{
				p=ex.charAt(i);
				if(p=='+'||p=='-'||p=='/'||p=='*')
				{
					break;
				}
			}
			if(i!=0)
				a=Double.parseDouble(ex.substring(0,i));
			else
				a=r;
			b=Double.parseDouble(ex.substring(i+1));
			if(p=='+')
				r=ob.add(a,b);
			else if(p=='-')
				r=ob.subtract(a,b);
			else if(p=='*')
				r=ob.multiply(a,b);
			else 
				r=ob.divide(a,b);
			System.out.println(r);
			ex1=sc.next();
		}while(ex1.equals("off")==false);
	}

}
