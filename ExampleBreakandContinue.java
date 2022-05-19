package corejava;

public class ExampleBreakandContinue {
	
	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
		if(i==14) {
			continue;
		}
		if(i==17) {
			break;
		}
		System.out.println(i);
		}
		
	}
}