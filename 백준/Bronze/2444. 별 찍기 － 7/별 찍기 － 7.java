import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt() * 2 -1;
		int star = 1 ;
		int blank = num/2;
		
		for(int i = 0; i<num; i++) {
			for(int ii = i; ii < blank; ii++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			
		}
			System.out.println();
			
			if(i < num/2){
				star += 2;
				
			}else{
				star -= 2;
				blank += 2;
			}
		
		}
	}
}