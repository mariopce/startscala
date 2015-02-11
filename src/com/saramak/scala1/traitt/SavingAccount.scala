package com.saramak.scala1.traitt


import com.saramak.scala1.traitt.Account


class SavingAccount extends Account with EmptyLogger {

  def withdraw(ammount : Double){
    log("ammount " + ammount);
  }
  
}