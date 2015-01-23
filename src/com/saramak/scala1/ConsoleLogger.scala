package com.saramak.scala1

trait ConsoleLogger extends NoLogger with Cloneable with Serializable with Runnable with Logger {
  override def log(msg: String): Unit = {
    println(msg)
  }

  def run(): Unit = {
    
  }
}