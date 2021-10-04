package loops;
//import java.util.Scanner;
//
//public class Break {
//
//	public static void main(String[] args) {
//		
////		for(int i=1; i <=100; i++) {
////			
////			if(i==35) {
////				break;
////			}
////			System.out.println(i);
////		}
//		
//		Scanner sc = new Scanner(System.in);
//				
//		for(; ;) {
//			int n = sc.nextInt();
//			if(n < 0) {
//				break;
//			}
//	
//		}
//
//	}
//
//}

public class Break
{  
    public static void main(String[] args) 
    {
        System.out.println("value =" + switchIt(4)); 
    } 
    public static int switchIt(int x) 
    {
        int j = 1;  
        switch (x) 
        
        {
        
        	case 1: j++;
        	case 2: j++;
        	case 3: j++;
        	case 4: j++;
        	case 5: j++;
            default: j++; 
            } 
        return j + x; 
        
    } 
}
