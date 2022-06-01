package corejava;
//java program to find duplicate elements in an String array
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
		//creating class
class PractStringArr {

	public static void main(String[] args) {
		// String Arrays
        String[] strArrays = {
                "Yogita",
                "Anuja",
                "Anjali",
                "Jayashree",
                "Shubham",
                "Tejas",
                "Yogita",
                "Priya",
                "Anjali"
        };
        // First convert to List
        List<String> list = Arrays.asList(strArrays);
 
        // just empty HashSet object
        Set<String> set = new HashSet<String>();
 
        // iterate through List
        for(String str : list) {
            // add element to Set/HashSet
            boolean flagForDuplicate = set.add(str);
 
            if(!flagForDuplicate) {
                System.out.println(str + " is duplicate element");
            }
        }
    }
}