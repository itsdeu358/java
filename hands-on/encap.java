package corejava;

class encap {

	//creating private access modifier
	
	private int id;
	private String name;
	private String address;
	
	//get method for id
	public int getId() {
		return id;
	}
	
	//set method for id
	public void setId(int id) {
		this.id = id;
	}
	
	//get method for name
	public String getName() {
		return name;
	}
	
	//set method for name
	public void setName(String name) {
		this.name = name;
	}
	
	//get method for address
	public String getAddress() {
		return address;
	}
	
	//set method for address
	public void setAddress(String address) {
		this.address = address;
	}
	
}
