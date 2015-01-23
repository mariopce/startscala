package com.samsung.scala1

class Person2 /*private*/ (/*private*/ val name :String ="", val age : Int = 29) {
  println("Constructed new person " + name);
  override def toString = "name " + name + " age " + age;
 
  
  class Marusz(val name:String = "Mariusz");
 
}