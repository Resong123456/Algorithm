import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] arr = br.readLine().split(" ");

		long num1 = Long.parseLong(arr[0] + arr[1]);
		long num2 = Long.parseLong(arr[2] + arr[3]);

		System.out.println(num1 + num2);

	}
}