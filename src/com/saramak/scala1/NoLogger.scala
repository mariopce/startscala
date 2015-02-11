package com.saramak.scala1

trait NoLogger extends Logger {
  def log(msg : String){ 
    // nothing 
  }
}