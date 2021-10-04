package String;
import java.util.*;

public class AnagramUserInput {
	
	static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        boolean anagram = true;
        Arrays.sort(a);
        Arrays.sort(b);
      
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                anagram = false;
            }
        }
        
        return anagram;
    }
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



//Scanner scan = new Scanner(System.in);
//String input = scan.nextLine().trim();
//scan.close();
//
//String[] tokens = input.split("[^\\p{Alpha}]+");
//
//int size = (input.isEmpty()) ? 0 : tokens.length;
//System.out.println(size);
//
//for(String s : tokens) {
//    System.out.println(s);