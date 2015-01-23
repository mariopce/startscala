package com.samsung
import com.samsung.scala1.Person
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.samsung.scala1.Counter
import com.samsung.scala1.Person
import com.samsung.scala1.Person2
import com.samsung.scala1.Person2
import com.samsung.scala1.Person2
import com.samsung.scala1.Singleton
class SingletonObjectTest extends FlatSpec with Matchers {

  "Singleton " should "generate unitque values" in {
    var s = new Singleton("nazwa")
    var un = s.id;
    assert(un==1);
    un = new Singleton("dsd").id;
    assert(un==2); //2
    s match {
      case _:Singleton => println("fds"); 
    }
  }
  
}