package exercise1;

import exercise1.SingularlyLinkedList;


public class boxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingularlyLinkedList<String> boxers= new SingularlyLinkedList <String>();
		
		boxers.addFirst("manny");
		boxers.addFirst("pagara");
		boxers.addFirst("bautista");
		boxers.addFirst("delahoya");
		boxers.addFirst("marquez");
		
		
		
		System.out.println("size : " + boxers.size());
		
	}

}
 
