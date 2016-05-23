package com.test

/**
  * Created by User on 21/05/2016.
  */
trait fakeHelperClass extends helperClass  {
  override def helperMessage()= "Fake Message"
  override def storeStuff(value:Int)={
    "Fake Save"
  }
}
