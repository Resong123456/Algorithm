import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 1;

		String result = "int";
		
		String[] arr = new String[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = "long ";
		}
		
		for(int i = 4; i <= N; i+=4) {
			System.out.print(arr[count++]);
			if(i == N) {
				System.out.println(result);
			}
		}
		
	}

}
