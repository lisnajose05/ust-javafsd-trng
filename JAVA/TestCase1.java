package testing.ust;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sql.ust.Connection1;

public class TestCase1 {

	@Test

	public void test() {
	//	fail("Not yet implemented");
		assertEquals(2, 2);
		assertEquals(5, Connection1.calculate(2,4));
	}
	@Test(expected = NullPointerException.class)

	public void test1() {
		String s=null;
		assertEquals("ABC",s.toUpperCase());
	}
	
	@After
	public void after() {
		System.out.println("In after");
	}
	
	@Before
	public void before() {
		System.out.println("In Before");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("In After Class");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("In before class");
	}

}
