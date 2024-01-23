import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		
		String result = "*";
		
		for(int i = 0; i < A; i++) { // i => i 번째 줄을 의미
			for(int j = 0; j < i+1; j++) { // j => 찍어낼 별의 갯수를 의미 
				System.out.print(result);
			}
			System.out.println();
		}

	}

}



