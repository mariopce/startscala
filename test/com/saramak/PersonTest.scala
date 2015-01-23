package com.saramak
import com.saramak.scala1.Person
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.saramak.scala1.Counter
import com.saramak.scala1.Person
import com.saramak.scala1.Person2
import com.saramak.scala1.Person2
import com.saramak.scala1.Person2
import com.saramak.scala1.ConsoleLogger
class PersonTest extends FlatSpec with Matchers {

  "Construct person " should "create person " in {
    var p = new Person("Mariusz");
    assert(p.gname == "Mariusz")
    assert(p.gage == 20)
  }
  
  "Construct person Logger trait" should "create person " in {
    var p = new Person("Mariusz") with ConsoleLogger;
    assert(p.gname == "Mariusz")
    assert(p.gage == 20)
  }
  
  
  
  "Construct no arg person " should "create person " in {
    var p = new Person;
    assert(p.gname == "")
    assert(p.gage == 20)
  }
  
  "Construct 2 arg person " should "create person " in {
    var p = new Person("Mariusz", 29);
    assert(p.gname == "Mariusz")
    assert(p.gage == 29)
  }
  "Primary Constructor of person2 " should "create peron2 object " in {
    var p = new Person2("Mariusz", 29)
    assert(p.name=="Mariusz")
    assert(p.age==29)
    println(p);
  }
  "Primary Constructor of person2 with default age " should "create peron2 object " in {
    var p = new Person2("Mariusz")
//    p.name="d";
    var p2 = p.Marusz;
    assert(p.name=="Mariusz")
    assert(p.age==29)
//    assert(p2.name=="f")
    println(p);
  }
  
}