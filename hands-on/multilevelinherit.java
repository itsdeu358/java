package corejava;

class singallevel {
	public void print_Name()
	{
		System.out.println("YOGITA");
	}
}

class employeeid extends singallevel{
	public void print_Id()
	{
		System.out.println(10);
	}
}
class employeedesignation extends employeeid{
	public void print_Assistance()
	{
		System.out.println("Assistance");
	}
}
//deriving class
class company{
	public static void main(String[] args)
	{
		employeedesignation g = new employeedesignation();
		g.print_Name();
		g.print_Id();
		g.print_Assistance();
	}
}
