package com.saramak.scala1

import com.saramak.scala1.traitt.EmptyLogger

/**
 * @author mario
 */
trait ShortConsoleLogger extends EmptyLogger {
  
  val maxLenght = 15
  var max = 2
  override def log(msg : String){
    print("Short " );super.log(msg);
  }
}