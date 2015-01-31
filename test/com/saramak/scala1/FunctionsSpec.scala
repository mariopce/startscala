package com.saramak.scala1
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import java.net.URL
import java.net.MalformedURLException
import java.io.IOException
class FunctionsSpec extends FlatSpec with Matchers {

  def sum( n : Int) : Int = {
    var sum = 0;
    for ( i<-1 to n ){
      sum += 1;
    }
    sum;
  }  
  it should " sum 100 numbers " in {
    var v = sum(100)
    assert(v==100, "Should add all numbers")
  }
  
  def procedure ( x : Int ) {
    println ("x " + x);
  }
  
  it should " use procedure" in {
    procedure(3);
    assert(true)
  }
  
  "Scala " should "use lazy init " in {
    lazy val words = scala.io.Source.fromFile("/home/mario/Kismet-20141113-04-36-37-1.alert");
    println(words);
  }
  
  it should "throw ex" in {
    var url = new URL("http://www.wp.pl");
    intercept[MalformedURLException] {
     url = new URL("//www.wpl.pl");
    }
    try {
      url.openConnection();
    }catch{
      case _: 
       MalformedURLException => println("Bad url")
      case ex: 
       IOException => ex.printStackTrace();
    }
    finally{
      
    }
  }
}