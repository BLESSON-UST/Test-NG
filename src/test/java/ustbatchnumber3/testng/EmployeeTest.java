package ustbatchnumber3.testng;

import org.testng.annotations.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class EmployeeTest 
    extends TestCase
{
	@Test
	public void Test1()
	{
		Employee e = new Employee("Blesson",25,"development");
		assertEquals(e.getName(), "Blesson");
		
	}
	@Test
	public void Test2()
	{
		Employee e1 = new Employee("Blesson",25,"development");
		assertEquals(e1.getAge(), 25);
		
	}
    
    
}
