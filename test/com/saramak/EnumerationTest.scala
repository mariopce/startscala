package com.saramak
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.saramak.scala1.Counter
import com.saramak.scala1.TrafficLightColor
import scala.Enumeration

class EnumerationTest extends FlatSpec with Matchers {

  "Trafic " should " display status" in {
    var w = TrafficLightColor.doWhat(TrafficLightColor.Red);
    assert(w=="stop")
    w = TrafficLightColor.doWhat(TrafficLightColor(2));
    assert(w=="go")
//    w = TrafficLightColor.doWhat(Value("Red"));
//    assert(w=="stop")
    for (c <- TrafficLightColor.values){
      println(c.id + " : " + c);
    }
    
  }
  
}