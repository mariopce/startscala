package com.saramak.scala1
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.saramak.scala1.traitt.SavingAccount
class TraitTest extends FlatSpec with Matchers {

   it should "log by console Logger" in {
     val account = new SavingAccount with ConsoleLoggerTrait with ShortConsoleLogger;
     println("max" + account.maxLenght)
     println("max2" + (account.max = 10));
     
     account.withdraw(222.22);
   }
  
  
}