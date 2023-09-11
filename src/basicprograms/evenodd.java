package basicprograms;

import java.util.Scanner;

public class evenodd {

		private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	       /* int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	        if(N%2!=0 || N>=6&&N<=20){
	            System.out.println("Weird");
	        }
	        else if(N%2==0|| N>=2||N<=5){
	            System.out.println("Not Weird");
	        }*/ 
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d= scan.nextDouble();
	        String s= scan.nextLine();
	        

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        scan.close();
		// TODO Auto-generated method stub

	}

}
