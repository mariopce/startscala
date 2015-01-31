package com.saramak.scala1

class Employee(name : String ="", age:Int=20, val salary :Double=0.0) extends Person(name:String) {
  
  private[this] var sallary = 0.0; 
  
  override def toString() : String = {
    super.toString() + " [salary = " + sallary + " ] ";
  }
  override def gage : Int = {
    2
  }
  override val money = 4
  
}