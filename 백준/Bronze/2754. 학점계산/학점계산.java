import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		double score = 0;
		double score1 = 0;
		
		if(str.equals("F")) {
			score = 0;
			score1 = 0.0;
		}else {
		
			switch(str.charAt(0)) {
			case 'A' : score = 4 ; break;
			case 'B' : score = 3 ; break;
			case 'C' : score = 2 ; break;
			case 'D' : score = 1 ; break;
			}
			
			switch(str.charAt(1)) {
			case '+' : score1 = 0.3; break;
			case '0' : score1 = 0.0; break;
			case '-' : score1 = - 0.3; break;
			}
		}
		System.out.println(score + score1);

	}
}
