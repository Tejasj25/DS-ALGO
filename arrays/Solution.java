package arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result{

    /*
     * Complete the 'candies' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static long candies(int n, List<Integer> arr, int[] a) {
    		int[] c = new int[n];
    		Arrays.fill(c,1);
    	
    		for(int i=1; i<n;i++) {
    			if(a[i]>a[i+1]) {
    				c[i] = c[i+1] + 1;
    			}
    		}
    		for(int i = 0;i<n-2;i++) {
    			if(a[i]<a[i+1]) {
    				c[i] = Math.max(c[i+1] + 1 , c[i]);
    			}
    		}
    		long sum = 0;
    		for(int i=0;i<0;i++) {
    			sum = sum + (long)c[i];
    		}
    		return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        

        
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

	
}

