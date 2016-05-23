package com.test

/**
  * Created by User on 19/05/2016.
  */
object TestClass extends TestClass with helperConnector

trait TestClass {
  def caching:helperClass
  def message()="Hello"

  def simpleSum(x:Int,y:Int)=(x+y,message())

  def simpleMultiple(x:Int) ={
    val h=caching.helperMessage()
    (h,x*2)
  }
  def save(value:Int)={
    caching.storeStuff(value)
  }
}
