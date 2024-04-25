import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* 1 2 '2 3 3 3 4' 4 4 4 */
		int A = sc.nextInt();
		int B = sc.nextInt();

		int[] result = new int[1001];

		int to=0, count=0;

		for(int i = 1; i<B+1; i++) {
			
			for (int j = 1; j<=i; j++) {
				
				if(count >= result.length-1) {
					break;
				};
				result[count] = i;
				count++;
			}	
				
		}
		for(int j=A-1; j<= B-1; j++) {
			to += result[j];
		}
		System.out.println(to);


	}
}
