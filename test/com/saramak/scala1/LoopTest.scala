package com.saramak.scala1
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
class LoopTest extends FlatSpec with Matchers {

  "A Scala  " should "iterate loop " in {
    var sum = 0;
    for (ch <- "Hello"){
      sum += ch;
    }
    assert(sum == 500);
  } 
  
  it should "use brake " in {
    breakable{
      for (i <- 100 until 2){
        println("i " + i);
        if (i == 1){
          break;
        }
      }
    }
  }
  
  
}