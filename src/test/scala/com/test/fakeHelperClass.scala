package com.test

/**
  * Created by User on 21/05/2016.
  */
trait fakeHelperClass extends helperClass  {
  override def someMessage()= {"Ellen"}
  override def storeStuff(value:Int)={
    println("Storing Fake Stuff")
    2
  }
}
