package com.saramak.scala1
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import scala.io.Source
import java.io.PrintWriter
import java.io.File
class FileOperationsTest extends FlatSpec with Matchers {
  
  it should "read file " in {
    
    var lineIter = Source.fromFile("README.md").getLines()
    var lastLine = "";
    for (l<-lineIter){
      println(l)
      lastLine = l;
    }
    assert(lastLine=="# startscala")
    
  }
  
  it should "read file to String" in {
    
    var line = Source.fromFile("README.md").mkString
    var lastLine = line;
    
    assert(lastLine=="# startscala\n") 
  }
  
  it should "read file numbers " in {
    
    val tokens = Source.fromFile("Numbers.md").mkString.split("\\s+")
    val numbers = for(w<- tokens if w=="123") yield w.toDouble;
    val numbers2 = tokens.map(_.toDouble)
    assert(numbers(numbers.length-1)==123);
  }
  
  it should "read from url " in {
    val source1 = Source.fromURL("http://www.wp.pl").mkString
    println(source1);
    assert(source1(2) == 'D')
  }
  
  it should "write new file " in {
    val out = new PrintWriter("n.txt");
    for(i<-1 to 100){
      out.print(i+" ");
    }
    out.close();
  }
  
  it should " listing all files in dir " in {
    val home = new File(System.getProperty("user.home"))
    val dirs = subdir(home)
    for (d <- dirs.take(20))
      println(d)
  }
  
  def subdir(dir:File) : Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdir _)
  }
  
  
}