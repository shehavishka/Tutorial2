package com.shehan

object main3a {
  def main(args:Array[String]): Unit ={
    var (a,b,c,d) = (2,3,4,5)
    val k : Float = 4.3f
    val g : Float = 4.0f

    b += 1
    printf("a. %d\n",b * a + c * d);
    d -= 1
    printf("b. %d\n", a);
    a += 1
    printf("c. %f\n", -2 * ( 5 - k)+ c)
    c += 1
    printf("d. %d\n",c)
    c += 1
    c = c * a
    c += 1
    printf("e %d\n", c)
  }
}
