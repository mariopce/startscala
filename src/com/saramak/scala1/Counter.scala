package com.saramak.scala1

import scala.beans.BeanProperty;
class Counter {

 
  private[this] var value = 0; //geter and seter //Object private access 
  val value2 = 0;
  @BeanProperty      //@BeanProperty generate setValue and getValue
  var value3 = 0;
  private[Counter] var name = ""
  def this(p : String ){
    this();
    this.name = name;
  }
  
  var page = 0 //geter and seter
  def age=page;
  def age_=(a:Int) {
    page = a;

  }
  
  def increaseV2() = {
    // value2 = 1+1; value2 is final
  }
  def increase() = {
    value +=1;
  }
  def decrease() = {
    value -=1;
  }
  def current () = { //geter 
    value
  }
  def curr = value; // geter
  
  def isLessThan(otherCounter:Counter){
    value < otherCounter.value2; // value Not possible because private[this] object private declareted
  }
}