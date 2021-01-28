//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Hello {
	public static void main(String[] args) {
		System.out.println("************");
		System.out.println("Hello World");
		//Scanner input = new Scanner(System.in);
		//System.out.print("Masukan Banyak Data = ");
        	//int a = input.nextInt(); 
		//System.out.println("Banyak: " + a);
		BufferedReader br = null;
 
		try {
		    // Create a buffered character-input stream
		    br = new BufferedReader(new InputStreamReader(System.in));

		    // read the whole line
		    System.out.println(br.readLine());

		    // get double
		    System.out.println(Double.parseDouble(br.readLine()));

		    // get integer
		    System.out.println(br.read());

		    // close the stream
		    br.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
