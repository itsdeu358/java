package corejava;

 class ParameterConstruct {
	//Default constructor
	ParameterConstruct (){
          System.out.println("Default constructor");
       }
       /* Parameterized constructor with 
        * two integer arguments
        */
	ParameterConstruct (int i, int j){
          System.out.println("constructor with Two parameters");
       }
       /* Parameterized constructor with 
        * three integer arguments
        */
	ParameterConstruct (int i, int j, int k){
          System.out.println("constructor with Three parameters");          
       }
           
       /* Parameterized constructor with 
        * two arguments, int and String
        */
	ParameterConstruct (int i, String name){
          System.out.println("constructor with int and String parameters");
       }
       public static void main(String args[]){
          //This will invoke default constructor
    	   ParameterConstruct  obj = new ParameterConstruct ();
          /* This will invoke the constructor 
           * with two int parameters
           */
    	   ParameterConstruct  obj2 = new ParameterConstruct(12, 12);
          /* This will invoke the constructor 
           * with three int parameters
           */
    	   ParameterConstruct obj3 = new ParameterConstruct (1, 2, 13);
        
          /* This will invoke the constructor 
           * with int and String parameters
           */
    	   ParameterConstruct  obj4 = new ParameterConstruct (1,"java");
       }

}
 