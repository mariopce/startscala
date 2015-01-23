package com.saramak.scala1

abstract class UndonableAction (val description : String) {
  def undo();
  def redo();

}