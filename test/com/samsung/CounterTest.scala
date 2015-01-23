package com.samsung
import collection.mutable.Stack
import org.scalatest._
import scala.util.control.Breaks._
import com.samsung.scala1.Counter
class CounterTest extends FlatSpec with Matchers {

  "Counter " should "increase " in {
    val counter = new Counter();
    counter.increase();
   
    assert(counter.curr==1);
    counter.age= 2;
    assert(counter.age==2)
  }
  "Counter " should " use geter " in {
    val counter = new Counter();
    // counter.value2 = 3; only geter
    counter.increaseV2();
    counter.setValue3(2);
    assert(counter.value2==0)
  }
}