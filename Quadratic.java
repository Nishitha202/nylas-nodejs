package labprogram1;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("enter the value of a:");
double a=userInput.nextDouble();
System.out.println("enter the value of b:");
double b=userInput.nextDouble();
System.out.println("enter the value of c");
double c=userInput.nextDouble();
if(a==0)
{
	System.out.println("the roots cannot be computed");
}
else {
	double d=Math.sqrt((b*b)-(4*a*c));
	if(d>0) {
		System.out.println("the root are real and distinct");	
		double r1=((-b+d)/(2*a));
		double r2=((-b-d)/(2*a));
		System.out.println("the root r1="+r1+"and r2="+r2);
		
	}
	else if(d==0) {
		System.out.println("the root are real and equal");	
		double r1=(-b/(2*a));
		System.out.println("the root r1="+r1);
			
	}else {
		System.out.println("the root are not real");	
		
	}
}

	}

}
