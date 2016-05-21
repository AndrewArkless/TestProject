package com.test

import com.test.TestClass
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers, WordSpecLike}

class TestScalaClass extends WordSpecLike with Matchers {

  val x = new TestClass with fakeHelperClass

  "TestClass" should {

    "Return 7 and Goodbye when simpleSum is called with 2 and 5" in {
      val result = x.simpleSum(2, 5)
      result shouldBe(7, "Hello")
    }
  }

  "Return 7 and Hi There when simpleSum is called with 2 and 5" in {
    val y = new TestClass {
      override def message() = "Hi There"
    }
    val result = y.simpleSum(2, 5)
    result shouldBe(7, "Hi There")
  }
  "Return andrew 4" in {
    val result = x.simpleMultiple(2)
    result shouldBe("Ellen", 4)
  }

  "Save 10" in {
    val result = x.save(10)
    result shouldBe (2)
  }

}

