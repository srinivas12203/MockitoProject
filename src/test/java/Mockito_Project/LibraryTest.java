/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Mockito_Project;

import org.junit.Test;
import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

import org.junit.Assert;

public class LibraryTest {
	


	/*
	 * addService = Mockito.mock(AddService.class); calcService = new
	 * CalcService(addService);
	 */
@Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test
 public void testStaticMethod()
    {
//    	PowerMockito.mockStatic(PowerMockitoStaticMethod.class);
    	int num1=10;
    	int num2=20;
    	int except=30;
    	System.out.println();
    //	PowerMockito.when(PowerMockitoStaticMethod.add(num1,num2)).thenReturn(except);
    	int actual =PowerMockitoStaticMethod.add(num1,num2);
    	Assert.assertEquals(except, actual);

    }
}