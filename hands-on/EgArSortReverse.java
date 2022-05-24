package corejava;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class EgArSortReverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array length:");
		Integer len= sc.nextInt();
		Integer a[]= new Integer[len];

		System.out.println("Enter:"+len+"Element to store in array\n");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("In Ascending order Modified arr[]: " + Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("In desceningn Order Modified arr[]: " + Arrays.toString(a));
		}
}