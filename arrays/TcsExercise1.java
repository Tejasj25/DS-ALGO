package arrays;

import java.util.Arrays;
import java.util.Scanner;

class TcsExercise1 {
	public static void main(String[] args) {
		
			Scanner sc  = new Scanner(System.in);
			int n  = sc.nextInt();
			int a[] = new int[n];
			int j =a.length-1;
			int i=0;
			
			Arrays.sort(a);
			
			while(i<j) {
				if(a[i] + a[j] == 0) {
					System.out.println("1");
				}else if(a[i] + a[j]>=0) {
					System.out.println("0");
				}
			}
			}
		}
	
