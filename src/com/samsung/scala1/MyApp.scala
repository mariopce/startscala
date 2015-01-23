package com.samsung.scala1

/**
 * @author mario
 */
object MyApp extends App {
    println("Hello, world!")
    var n = 2;
    def abs(x: Double) = { if (x>0) x else -x;}
    while (n > 0){
      println("n = " + n);
      n -= 1;
    }
    n = 10;
//    for (i <- 0 to 10 ){ // until do x-1 a to do x
//      println("i = " + i);
//    }
//    for (ch <- "Hallo") {
//      println("ch "+ ch);
//    }
//    
//    for (i <- 1 to 3; j <- 1 to 4 if i == j){
//      println("i " + i + "j " + j);
//    }
    for (i <- 1 to 3; j <- i to 3) {
//      println(" ii " + i + " j " + j);
    }
    for (i <- 1 to 10) yield i % 3; {
      println("i " );
    }
    var s = abs(-2.0);
    println("s " + decorate(left= "{", str=""+s, right ="}"));
    
    aa(null);
    def aa(args: Array[String]) {
      println("Hello, world! " + args)
    }
    
    def decorate(str: String, left : String = "[", right : String = "]") = {
      left + str+right;
    }
    println("sum  " + sum(1 to 6: _*));
    def sum(args: Int*) = {
      var result = 1; 
      for (arg <- args) result *= arg
      result  
    }
    var pp = box("Hello");
    println("p " + pp);
    lazy val words = io.Source.fromFile("/usr/share/dict/words").mkString
//    throw new IllegalArgumentException("xxx");
    val a = new Array[String](10);
    println("array " + a(1));
    
    
    def box(str: String) : Unit = {
      val border = "-"*str.size +"--\n";
      println(border +"|" + str + "|\n"+border);
    }
    
}