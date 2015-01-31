package com.saramak.scala1
import collection.mutable.Stack
import sys.process._
import org.scalatest._
import scala.util.control.Breaks._
import scala.io.Source
import java.io.PrintWriter
import java.io.File
class ProcessOperationsTest extends FlatSpec with Matchers {
  
  it should " listing dir " in {
       val str  = "ls -lA " !!;
       println(str);
       assert(str.size > 0)
  }
  
    it should " listing dir and grep  " in {
       val str  = "ls -lA " #| "grep src" !!;
       println(str);
       assert(str.size > 0)
  }
  
  it should "use regexp" in {
    val numberPattern = "[0-9]+".r;
    for (matchingString <- numberPattern.findAllIn("22 fdsfds, 43 fds 33")){
      println(matchingString);
    }
  }
  
  
}