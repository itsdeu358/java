package corejava;

public class Constructoroverloading {
	 String name;
     double gpa;

     Constructoroverloading(String name, double gpa) {
        
        this.name = name;
        this.gpa = gpa;
     }
      Constructoroverloading(String name) {
            this.name = name;
        }
     
     public static void main(String[] args) {
         Constructoroverloading obj=new Constructoroverloading("Yogita ", 9.7); 
         Constructoroverloading abc=new Constructoroverloading("Yogita"); 
         System.out.println("Name:"+ obj.name +"\t"+ "Gpa:"+obj.gpa);
         System.out.println("Name:"+abc.name);

     }
}

