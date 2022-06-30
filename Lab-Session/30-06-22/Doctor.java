package corejava;
		import java.util.*;
		import java.io.*;
//creating class
		 class Doctor 
		{
			 //creating attributes
		    private int doctorId;
		    private String doctorName, location;
		    //creating variables
		    Doctor(int i,String n,String l)
		    {
		        doctorId = i;
		        doctorName = n;
		        location = l;
		    }
		    //getters and setters
		    public void setDoctorId(int i) {
		        doctorId = i;
		    }

		    public void setDoctorName(String doctorName) {
		        this.doctorName = doctorName;
		    }
		    
		    public void setLocation(String location) {
		        this.location = location;
		    }
		    //printing Id, name and location of doctor
		    public void getDetails()
		    {
		        System.out.println("Doctor ID: "+doctorId);
		        System.out.println("Doctor Name: "+doctorName);
		        System.out.println("Location: "+location);
		    }
		}
		 //extending class
		class SpecialistDoctor extends Doctor
		{
		    private String specialist;

		    public void setSpecialist(String s) {
		        this.specialist = s;
		    }

		    public String getSpecialist() {
		        return specialist;
		    }
		    //creating variables
		    SpecialistDoctor(int i,String n,String l,String s)
		    {
		        super(i, n, l);
		        specialist = s;
		    }
		    //get method
		    public void getDetails()
		    {
		        super.getDetails();
		        System.out.println("Specialist: "+specialist);
		    }
		}
		//creating class and main method
		class SourceTwo {
		    public static void main(String[] args) {
		    	//scanner class to take input from user
		        Scanner sc = new Scanner(System.in);

		        String t = sc.nextLine();
		        //if else statement
		        if(t.equalsIgnoreCase("Specialist"))
		        {
		            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
		            s.getDetails();
		        }
		        else if(t.equalsIgnoreCase("Doctor"))
		        {
		            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
		            s.getDetails();
		        }
		        else
		        {
		            System.out.println("Invalid Input");
		        }     
		        sc.close();  
		    }
		
	}

