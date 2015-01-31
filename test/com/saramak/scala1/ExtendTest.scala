package com.saramak.scala1
import com.saramak.scala1.Person
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.saramak.scala1.Counter
import com.saramak.scala1.Person
import com.saramak.scala1.Person2
import com.saramak.scala1.Person2
import com.saramak.scala1.Person2
import com.saramak.scala1.Singleton
import com.saramak.scala1.DoNothingAction
class ExtendsTest extends FlatSpec with Matchers {
  
  "Square " should " extends rectangle" in {
    var square = new SquerImpl(1, 2, 3);
    var sq = new Square(1, 2, 3){
      var name = "fds";
    }
    square.name = "a"
    assert(square.width == 3)
    assert(square.CONST == 1)
    assert(square.name == "a")
    assert(sq.name == "fds")
    assert(sq.CONST == 20)
  }
 
  
  "Actions" should " do Action" in {
    var actions = Map("open " -> DoNothingAction, "save" -> DoNothingAction);
    
  }
}