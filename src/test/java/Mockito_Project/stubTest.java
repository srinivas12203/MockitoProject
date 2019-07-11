package Mockito_Project;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

public class stubTest {


	@SuppressWarnings("unchecked")
	@Test
	public void testMethod() {
		ArrayList mockedList = mock(ArrayList.class);

		when(mockedList.get(0)).thenReturn("first-element");

		System.out.println(mockedList.get(0));
		assertEquals("first-element", mockedList.get(0));
		
		// "null" gets printed as get(1) is not stubbed
		System.out.println(mockedList.get(1));
	}

}


