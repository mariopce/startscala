package com.saramak.scala1

class Account private (val id : Int, initialBalance : Double) {
  private var balance = initialBalance;
  def balancs = this.balance;
}
object Account {
  private var value = 0;
  def newUniqueNumber() = {
    value += 1;
    value;
  }
  def apply(initialBalance : Double)= {
    new Account(newUniqueNumber(), initialBalance);
  }
}
