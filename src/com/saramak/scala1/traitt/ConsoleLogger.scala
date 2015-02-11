package com.saramak.scala1.traitt

/**
 * @author mario
 */
trait ConsoleLogger extends EmptyLogger with Cloneable with Serializable {
  override def log(msg: String): Unit = {
    println(msg)
  }
}