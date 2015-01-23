package com.saramak
import com.saramak.scala1.Person
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.saramak.scala1.Counter
import com.saramak.scala1.Account


class CompanionObjectTest extends FlatSpec with Matchers {

  "Co  " should " create acconts " in {
     val a = Account(1001.0);
     val b = Account(1002.0);
     val c = Account(1003.0);
     assert(a.id==1);
     assert(b.id==2);
     assert(c.id==3);
     assert(a.balancs == 1001.0)
  }
  
}