package com.google.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
	
	LibCalculator lib =  new LibCalculator();
			
  @Test
  public void testAddValidData() {
	  
	 String actSum =   null;// lib.add(10,12);
	 String expSum =  null;
	 Assert.assertEquals(actSum, expSum);
	 
  }
  
  @Test
  public void testAddOp1As0() {
	  
	 int actSum =    lib.add(0,12);
	 int expSum =  0;
	 Assert.assertEquals(actSum, expSum);
	 
  }
  
  @Test
  public void testAddOp1AsLessThan0() {
	  
	 int actSum =    lib.add(-4,12);
	 int expSum =  0;
	 Assert.assertEquals(actSum, expSum);
	 
  }
  
  
  @Test
  public void testAddOp2AsLessThan0() {
	  
	 int actSum =    lib.add(4,-12);
	 int expSum =  0;
	 Assert.assertEquals(actSum, expSum);
	 
  }
  
  @Test
  public void testAddOp2As0() {
	  
	 int actSum =    lib.add(10,0);
	 int expSum =  0;
	 Assert.assertEquals(actSum, expSum);
	 
  }
  
  
//  @Test
  public void testSubValidData() {
	  int actDiff = lib.sub(30,20);
	  int expDiff = 10;
	  Assert.assertEquals(actDiff, expDiff);
	  
	
}
  
  
}
