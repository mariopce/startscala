package com.saramak.scala1

import com.saramak.scala1.traitt.EmptyLogger

trait ConsoleLoggerTrait extends EmptyLogger with Cloneable with Serializable with Runnable {
   override def log(msg: String)  = {
    print("Console: " + msg);
//    super.log(msg);
  }

  override def run(): Unit = {
    
  }
}