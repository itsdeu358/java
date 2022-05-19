package corejava;
public class ExampleofCOver {
	String name;
	int Id;
    double gpa;

    ExampleofCOver(String name, int Id, double gpa) {
       this.name = name;
       this.Id = Id;
       this.gpa = gpa;
    }
        ExampleofCOver(String name, int Id) {
           this.name = name;
           this.Id = Id;
       }
        ExampleofCOver(String name) {
            this.name = name;
        }
    
    public static void main(String[] args) {
    	ExampleofCOver obj=new ExampleofCOver("Yogita ",10, 9.7); 
    	ExampleofCOver obj1=new ExampleofCOver("Yogita", 10); 
    	ExampleofCOver obj2=new ExampleofCOver("Yogita");
        System.out.println("Name:"+ obj.name +"\t"+ "Id:"+obj.Id+"\t"+ "Gpa:"+obj.gpa);
        System.out.println("Name:"+ obj1.name +"\t"+ "Id:"+obj1.Id);
        System.out.println("Name:"+ obj2.name);
    }
}

