import java.util.*;
import java.util.concurrent.RecursiveAction;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 StringBuilder sb = new StringBuilder();

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        int e = b * d;
	        int f = (a * d) + (b * c);

	        for (int i = Math.max(e, f); i >= 1 ; i--) {
	            if (e % i == 0 && f % i == 0){
	                e /= i;
	                f /= i;
	            }
	        }

	        sb.append(f + " ");
	        sb.append(e);

	        System.out.println(sb.toString());

	}
}
