package com.saramak.scala1
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.saramak.scala1.Counter
class MyIntegerTest extends FlatSpec with Matchers {

  "MyInteger " should " multiple by" in {
    val myInt1 = new MyInteger(3);
    val myInt2 = new MyInteger(2);  
    val res = myInt1 * myInt2; 
    assert(res.value==6);
    
  }
  
   "MyInteger " should " use unary  operator" in {
    val myInt1 = new MyInteger(3);
    
    val res = -myInt1; 
    assert(res.value==2);
    
  }
  
}