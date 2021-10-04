package arrays;
import java.io.*;
import java.util.*;

class MaxSubArray {
			public static void main(String[] args) {
				int [] a = {-2, -3, -4, -1, -2, -1, -5, -3};
				int n = a.length;
				System.out.println("Maximum contiguos sum is " +maxSubArraySum(a,n));
			}
			static int maxSubArraySum(int a[], int n){
				 int maxSum = 0;
				 int currSum = 0;
				 
			for(int i=0; i<a.length;i++) 
			{
				currSum =currSum + a[i];
				
				if(currSum>maxSum) 
				 maxSum = currSum ;
				if(currSum<0) 
					currSum=0;
			}
			return maxSum;
			}
}
