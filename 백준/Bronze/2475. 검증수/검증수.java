import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int[] arr = new int[5];
    	int result = 0;
    	int result1 = 0;
    	int result2 = 0;
    	int result3 = 0;
    	int result4 = 0;
    	int resultr = 0;
    	
    	for(int i = 0; i<arr.length; i++) {
    		arr[i] = sc.nextInt();
    		
    		result = arr[0] * arr[0];
    		result1 = arr[1] * arr[1];
    		result2 = arr[2] * arr[2];
    		result3 = arr[3] * arr[3];
    		result4 = arr[4] * arr[4];
    		
    		resultr = result + result1 + result2 + result3 + result4;
    	}
    	
    	int resultre = (resultr % 10);
    	
    	
		System.out.println(resultre);    
		
		    }
		}