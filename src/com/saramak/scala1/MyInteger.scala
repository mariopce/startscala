package com.saramak.scala1

class MyInteger(v:Int) {
  
  var value=v; 
  
  def unary_-() = {
    new MyInteger(value-1)
  }
  
  def *(other:MyInteger) = {
    new MyInteger(value*other.value);
  }

}