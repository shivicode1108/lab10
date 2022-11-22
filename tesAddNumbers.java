package J_unit_test_package;
public class j_unit_functions {
	
	void AddSum()
	{
	int n1 = 225, n2 = 115, sum;  
	sum = n1 + n2;  
	System.out.println("The sum of numbers is: "+sum);  
	}  
	void TestStringConcatenation1()
    {  
		   String s="Naman"+" Taneja";  
		   System.out.println(s);  
    }  
	public static void main(String args[])   
	{  
		j_unit_functions ob = new j_unit_functions();
		ob.AddSum();
		ob.TestStringConcatenation1();
		
	}
}
