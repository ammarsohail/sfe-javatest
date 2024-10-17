package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassBook {

	@Test
	void testAddBook_testCase1() {
		//Test Case 1: Check the function with valid inputs
		//Test Case 1_Test Data 1
		Book booktestCase1Data1 = new Book ("1abcd", "First Book", 10, 5.1, "Kids");
		//assertEquals ("The book information can be addedddd", booktestCase1Data1.AddBook(), "01 assertion of test case 01 failed..");
		//Test Case 1_Test Data 2
		Book booktestCase1Data2 = new Book ("1abcd", "First Book AB AC", 10, 39.7,
		"Kids");
		//assertEquals ("The book information can be added", booktestCase1Data2.AddBook(), "02 assertion of test case 01 failed..");
		Book booktestCase1Data3 = new Book ("1abcd", "First Book", 10, 249.6,
		"History");
		//assertEquals ("The book information can be added", booktestCase1Data3.AddBook(), "03 assertion of test case 01 failed..");
		
		
		assertAll ("", ()->assertEquals("The book information can not be addeddd", booktestCase1Data1.AddBook(), "01 assertion of test case 01 failed.."),
		()->assertEquals ("The book information can be added", booktestCase1Data2.AddBook(), "02 assertion of test case 01 failed.."),
		()->assertEquals ("The book information can be added", booktestCase1Data3.AddBook(), "03 assertion of test case 01 failed.."));
		
	}
	
	@Test
	void testAddBook_testCase2() {
		//Test Case 2: Check the function with invalid Book ID
		//Test Case 2_Test Data 1
		Book booktestCase2Data1 = new Book ("1abc", "First Book", 10, 15.4, "Kids");
		assertEquals ("The book information cannot be added", booktestCase2Data1.AddBook());
		
	}
}
