package com.saramak.scala1

import com.saramak.scala1.NoLogger
import com.saramak.scala1.traitt.EmptyLogger

class Person extends EmptyLogger {

  private var name="";
  private var age = 20;
  val money = 0;
  def this(name : String) = {
    this()
    log(">>>" + name)
    this.name = name;
  }
  def this(name: String, age : Int = 20){
    this(name)
    this.age=age;
  }
  
  def gname = this.name;
  def gage : Int = this.age;
  
  override def toString() : String = {
     "" + gname+ " " + gage;
  }
  
}