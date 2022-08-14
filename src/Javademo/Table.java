package Javademo;

import org.testng.annotations.Test;

//import io.netty.util.AsciiString;

//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;

public class Table {
  @Test
  public static void main (String[ ] args){
	  int a = 5;
	  for(int i = 1; i <= 10; ++i)
	  {
		System.out.printf(" %d * %d = %d \n", a, i, a*i);
	  }
  }
  
}
