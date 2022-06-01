package corejava;
//java program to iterat4e a linked list in reverse order
import java.util.Iterator;
import java.util.LinkedList;
//creating class
 class LinkedListReverse {
	 //main method
	public static void main(String []args) {
		//Creating linked list
LinkedList<String> linkedList = new LinkedList<>();
        
        // adding elements to linked list
        linkedList.add("Anuja");
        linkedList.add("Anjali");
        linkedList.add("Jayashree");
        linkedList.add("Shubham");
        linkedList.add("Yogita");
        //to print reverse list
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) 
        {
        	//printing the reverse list
            System.out.println(iterator.next());
        }
    }
}