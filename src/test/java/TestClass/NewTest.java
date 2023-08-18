package TestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Testing f");
	  String actual = "string";
	  Assert.assertEquals("string", actual);
  }
  
  @Test
  public void f2() {
	  System.out.println("Testing f2");
	  String actual = "string";
	  Assert.assertEquals("string", actual);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
