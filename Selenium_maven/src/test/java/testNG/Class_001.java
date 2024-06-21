package testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_001 {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @Test
  public void d() {
	  System.out.println("d");

  }
  @BeforeSuite
  public void t() {
	  System.out.println("t");

  }
}
