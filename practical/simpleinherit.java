package corejava;

class Simpleinherit {
	public void print() {
        System.out.println("YOGITA");    
    }
}
class SimpleOne extends Simpleinherit {
    public void show() {
        System.out.println("DESH");
    }
}

 class RunMethod{
	 public static void main(String[] args) {        
	        SimpleOne s= new SimpleOne();
	        s.print();
	        s.show();
	        s.print();
	    }
	}

