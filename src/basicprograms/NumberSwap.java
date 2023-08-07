package basicprograms;
import java.util.*;

public class NumberSwap {
	static void swapValueUsingThirdVariable(int m,int n) {
		int temp=m;
		m=n;
		n=temp;
		System.out.println(" Values after Swapping using Third variable "+m+" and "+n);
	}
	
	static void swapValueWithoutUsingThirdVariable(int m,int n) {
		m=m-n;
		n=m+n;
		m=n-m;
		System.out.println(" Values after Swapping without using 3rd variable"+m+" and "+n);
	}
	static void swapValueUsingXOROperator(int m,int n) {
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println(" Values after Swapping using XOR Operator "+m+" and "+n);
	}
	
	static void swapValueUsingArthimaticVariable(int m,int n) {
		m=(m+n)-(n=m);
		System.out.println(" Values after Swapping Arithematic Operation "+m+" and "+n);
	}
	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the First number");
		int num1=s.nextInt();
		System.out.println("enter the Second number");
		int num2=s.nextInt();
		s.close();
		swapValueUsingThirdVariable(num1,num2);
		swapValueWithoutUsingThirdVariable(num1,num2);
		swapValueUsingXOROperator(num1,num2);
		swapValueUsingArthimaticVariable(num1,num2);
		

	}

}
