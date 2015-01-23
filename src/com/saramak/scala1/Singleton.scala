package com.saramak.scala1

class Singleton(val name : String = "s") {
  var id = Singleton.newUniqueNumber();
  println("new id" + id);
}
object Singleton {
    private var value = 0;
    def newUniqueNumber() = {
      value += 1;
      value;
    }
  }