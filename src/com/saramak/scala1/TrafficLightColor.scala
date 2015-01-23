package com.saramak.scala1

object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value;
  val Red, Yellow, Green = Value;
  def doWhat(color: TrafficLightColor) : String = {
    var what = "";
    if (color == Red) {
      what = "stop";
    } else if (color == Yellow) {
      what = ("wait")
    } else if (color == Green) {
      what = ("go")
    }
    println(what)
    what
  }
}