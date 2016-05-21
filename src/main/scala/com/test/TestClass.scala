package com.test

/**
  * Created by User on 19/05/2016.
  */
class TestClass extends helperClass{
  def message()="Hello"
  def simpleSum(x:Int,y:Int)=(x+y,message())
  def simpleMultiple(x:Int) ={
    val h=someMessage()
    (someMessage(),x*2)
  }
  def save(value:Int)={
    println("Real Save")
    storeStuff(value)
  }
}
