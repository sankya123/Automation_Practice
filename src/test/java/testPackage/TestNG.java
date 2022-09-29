package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG 
{
	public class TestClass_TestNG
	{

		@BeforeClass
		public void beforeClass()
		{
			System.out.println("beforeClass");
		}
		
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("beforeMethod");
		}
		
		@Test (priority=2)
		public void TestA()
		{ 
			System.out.println("testA");
		}
		@Test (priority=1)
		public void TestB()
		{
			System.out.println("testB");
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("afterMethod");
		}

		@AfterClass
		public void afterClass()
		{
			System.out.println("afterClass");
		}
	}
}
