package corejava;
//creating class
public class GarbageCollection {
	public void finalize()
	{System.out.println("Garbage collected object");}
	
	public static void main(String args[]){
	//creating a objects
	GarbageCollection s1=new GarbageCollection();
	GarbageCollection s2=new GarbageCollection();
	//assigning the values
	s1=null;
	s2=null;
	//printing Garbage collection
	System.gc();
	}
	}


