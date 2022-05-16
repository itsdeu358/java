package corejava;

public class encap2 {
	public static void main (String[] args) {
		
		//creating object of encapsulation class
		
		encap e=new encap();
		
		//setting value
		
		e.setId(10);
		e.setName("Yogita");
		e.setAddress("house no 508 Turbhe");
		
		//displaying value
		
		System.out.println("Id:" +e.getId());
		System.out.println("Name:" +e.getName());
		System.out.println("Address:" +e.getAddress());
	}

}
