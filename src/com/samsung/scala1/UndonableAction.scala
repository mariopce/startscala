package com.samsung.scala1

abstract class UndonableAction (val description : String) {
  def undo();
  def redo();

}