package basicprograms;
import java.util.Scanner;

public class LeapYaer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year from");
		int yearF=sc.nextInt();
		System.out.println("enter the year to");
		int yearT=sc.nextInt();
		System.out.println("enter the exact year");
		int year=sc.nextInt();
		
		sc.close();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("The year "+year+" is a Leap year");
		}else {
			System.out.println(" The year is common year");
		}
		for(int i=yearF;i<=yearT;i++) {
			if(((i%4==0)&&(i%100!=0))||(i%400==0)) {
				System.out.print(i+"  ");
			}	
		}
		System.out.println( );
		//using ternary operator
		String output=(((year%4==0)&&(year%100!=0))||(year%400==0))?"The year is "+year+" Leap year":"common year";
		System.out.println(output);
	

	}


}
