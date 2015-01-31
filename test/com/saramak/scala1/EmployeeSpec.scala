package com.saramak.scala1
import collection.mutable.Stack
import org.scalatest._
import com.saramak.scala1.Person
import com.saramak.scala1.Employee

class EmployeeSpec extends FlatSpec with Matchers {

  "Employee " should " check type " in {
    var e = new Employee();
    var b = e.isInstanceOf[Person]==true;
    assert(b)
  }
  
  "Employee " should " cast to Employee" in {
    var p = new Employee;
    var e = p.asInstanceOf[Employee]; 
    assert(e.isInstanceOf[Employee]);
  }
  
  "Employee " should " use maching pattern " in {
    var p = new Person;
    p match {
      case _: Employee => assert(false);
      case p: Person => assert(p.gage==20)
    }
  }
  
  "val  " should " be override" in {
    var e = new Employee("Mariusz ", 29, 1.0);
    assert(e.money==4)
  }
  
  
}