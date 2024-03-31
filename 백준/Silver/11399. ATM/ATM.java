import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt(); 

    	int[] arr = new int[num];
    	
    	for(int i = 0; i<num; i++) {
    		arr[i] = sc.nextInt();
    		
    	}
    	Arrays.sort(arr);
	
    	int time = 0;
    	int sum = 0;
    	
    	for(int i = 0; i<num; i++) {
    		sum += time + arr[i];
    		
    		time += arr[i];
    	}
    	System.out.println(sum);
    }
}