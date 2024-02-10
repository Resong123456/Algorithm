import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int A = Integer.parseInt(str, 16);

		System.out.println(A);

		/* test1. 숫자 시 소문자로 변경됨 
		int A = sc.nextInt();
		String str = Integer.toString(A, 16);
		System.out.println(str);
		*/
	}

}