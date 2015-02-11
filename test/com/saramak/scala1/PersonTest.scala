package com.saramak.scala1

import org.scalatest.FlatSpec
import org.scalatest.Matchers
class PersonTest extends FlatSpec with Matchers {

  "Construct person " should "create person " in {
    var p = new Person("Mariusz");
    assert(p.gname == "Mariusz")
    assert(p.gage == 20)
  }
  
  "Construct person Logger trait" should "create person " in {
    var p = new Person("Mariusz") with ConsoleLoggerTrait;
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