package com.saramak.scala1

import java.awt.Rectangle

abstract class Square(x : Int, y : Int, width:Int) extends Rectangle(x, y, width, width) {
  var name : String
  val CONST : Int = 20;
}