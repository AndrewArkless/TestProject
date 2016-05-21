package com.test

/**
  * Created by User on 21/05/2016.
  */

object helperClass extends helperClass

trait helperClass {
  def someMessage()="Andrew"
  def storeStuff(value:Int): Int ={
    println("Storing Real Stuff")
    value
  }
}
