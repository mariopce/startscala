package com.saramak.scala1
import collection.mutable.Stack
import scala.collection.mutable.ArrayBuffer;
import org.scalatest._
import scala.util.control.Breaks._
import java.net.URL
import java.net.MalformedURLException
import java.io.IOException
class ArraySpec extends FlatSpec with Matchers {

  "Array " should " be created " in {
    val b = ArrayBuffer[Int]();
    val c = new ArrayBuffer[Int];
    assert(b==c)
  }
  "Array with six element " should " be created " in {
    val a = ArrayBuffer[Int](1);
    a += 2;
    a += (3, 4, 5, 6)
    println(a);
    assert(a.size==6);
  }
  "Array with three element " should " be created " in {
    val a = ArrayBuffer[Int](1, 2); 
    a.trimEnd(1);
    a ++=  Array(2, 3);
    println(a);
    assert(a.size==3);
  }
  
  "Array insert test " should " show insert " in {
    val a = ArrayBuffer[Int](1, 2, 3, 4, 5);
    println("a " + a);
    a.insert(1, 7);
    println("a " + a);
    a.remove(3);
    println("a " + a);
    assert(a.size==5)
  }  
  
  "Array modificable" should " modify" in {
    val a = ArrayBuffer[Int](1, 2, 3, 4, 5)
    val res = for (i<- a) yield {
      2*i;
    } 
    println("res  " + res)
    val res2 = for (i<- a if i%2 == 0) yield {
      2*i;
    }
    println("res2 " + res2);
    assert(res2.last == 8)
    val res3 = a.filter( _ % 2 == 0 ).map(2 * _);
    println("res3 " + res3);
    assert(res3.last == 8)
  }
  
  "mkSting  " should "separate array " in {
    val a = ArrayBuffer[Int](1, 2)
    val res = a.mkString(" and ") 
    println(a);
    println(res)
    assert("1 and 2" == res)
  }
}