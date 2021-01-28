import java.util.Scanner;
class Hello {
	public static void main(String[] args) {
		System.out.println("************");
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Banyak Data = ");
        	int a = input.nextInt(); 
		System.out.println("Banyak: " + a);
	}
}
