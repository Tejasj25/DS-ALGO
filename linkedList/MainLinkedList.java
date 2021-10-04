package linkedList;
public class MainLinkedList {

	public static void main(String[] args) {
		
		
		
		MyLinkedList<Integer> myll = new MyLinkedList<>();
		
		for(int i=0;i<10;i++) {
			myll.add(i);
		}
		
		
		myll.print();
		
		
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> Al = new ArrayList<>();
//		
//		getTimeDiff(ll);
//		getTimeDiff(Al);
//		
//	}
//	
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i=0;i<100000;i++) {
//			list.add(0, i );
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + " ---> " + (end - start));
	}

}
