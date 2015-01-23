package com.samsung.scala1

object DoNothingAction extends UndonableAction("Do nothing") {
  override def redo(): Unit = {
  }

  override def undo(): Unit = {
  }
}