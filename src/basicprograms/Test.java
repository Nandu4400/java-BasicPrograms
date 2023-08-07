package basicprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		try {
			BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
			String name=reader.readLine();
			System.out.println("Entered name "+name);
		}catch (IOException e) {
			e.printStackTrace();
		}
		Scanner s=new Scanner(System.in);
		int a=  s.nextInt();
		System.out.println("Entered number "+a);
		float b=  s.nextFloat();
		System.out.println("Entered number "+b);
		s.close();
		if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");
 
            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
		
	}

}
