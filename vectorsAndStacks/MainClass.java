package vectorsAndStacks;

public class MainClass {

	public static void main(String[] args)throws Exception {
		MyStack<Integer> stack = new MyStack<>(); 
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		int pooped = stack.pop();
		
		System.out.println(pooped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
	
	}

}
