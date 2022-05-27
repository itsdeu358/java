package corejava;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListReverse {
	public static void main(String []args) {
LinkedList<String> linkedList = new LinkedList<>();
        
        // adding elements to linked list
        linkedList.add("Anuja");
        linkedList.add("Anjali");
        linkedList.add("Jayashree");
        linkedList.add("Shubham");
        linkedList.add("Yogita");
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}