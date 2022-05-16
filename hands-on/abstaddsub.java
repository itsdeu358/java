package corejava;

class abstaddsub extends abstractadd {

	public int addition(int n1, int n2) {
		return n1+n2;
	}
	public int substraction(int n1, int n2) {
		return n1-n2;
	}
	
	public static void main (String []args) {
		
		abstractadd a=new abstaddsub();
		
		System.out.println("Addition of two numbers: " +a.addition(20, 10));
		System.out.println("Substraction of two numbers: " +a.substraction(20, 10));
		
	}
	}

