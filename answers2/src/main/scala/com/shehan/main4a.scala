package com.shehan

object main4a {

  def cal(normal:Double, ot: Double) : Double ={
    var normalValue : Int = 250
    var otValue : Int = 85
    var taxRate : Double = 0.88

    println("Normal hours pay: "+ (normal*normalValue))
    println("OT hours pay: "+(ot*otValue))

    return (normalValue*normal + ot*otValue)* taxRate
  }

  def main(args:Array[String]): Unit ={
    println("Normal hours: "+ 40 + "\nOT hours: "+ 30)
    println("Total Salary is (+12%tax) : "+ cal(40,30)+ "/=")
  }
}
