import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
			
			String str = sc.next().toUpperCase(); 
			int[] arr = new int[26];
			int max = 0;
			char ch = '?';
			
			for(int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 65]++;
			}
			
			for(int i = 0; i <arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
					ch = (char) (i + 65);
				}else if(arr[i] == max) {
					ch = '?';
				}
			}
			System.out.println(ch);
		}
	}