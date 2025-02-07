import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		word = 5 + word;
		System.out.println(Integer.parseInt(word)+5);

		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = in.nextLine();
		word = 4 + word + 3;
		System.out.println(Double.parseDouble(word)+ 3.4);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String word = in.nextLine();
		System.out.println(!Boolean.parseBoolean(word));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		word = word + 3;
		int num = Integer.parseInt(word) + 2;
		System.out.println((char)num);
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		word = word + 1;
		int num = Integer.parseInt(word)/ 2;
		System.out.println(num + 0.0);
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = in.nextLine();
		word = 1+ word;
		double num = Double.parseDouble(word);
		System.out.println((int)num);
		
	}

}
