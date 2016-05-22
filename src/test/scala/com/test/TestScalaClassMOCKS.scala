package com.test
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers, WordSpecLike}
import org.mockito.Mockito._
import org.mockito.Matchers._

class TestScalaClassMOCKS extends WordSpecLike with Matchers {
  val x = new TestClass {
    val caching = mock(classOf[fakeHelperClass])
    when(caching.helperMessage()).thenReturn("Fake Message Mock!")
    when(caching.storeStuff(anyInt())).thenReturn("Fake Save Mock!")
  }

  "TestClass" should {
  //Only testing Class

    "Return 7 and Goodbye when simpleSum is called with 2 and 5" in {
      val result = x.simpleSum(2, 5)
      result shouldBe(7, "Hello")
    }
  }

  "Return 7 and Hi There when simpleSum is called with 2 and 5" in {
    val y = new TestClass {
      override def message() = "Hi There"
      override def caching: helperClass = ??? //Never used so not defined
    }

    val result = y.simpleSum(2, 5)
    result shouldBe(7, "Hi There")
  }
  // Using MOCK!

  "Return andrew 4" in {
    val result = x.simpleMultiple(2)
    result shouldBe("Fake Message Mock!", 4)
  }

  "Save 10" in {
    val result = x.save(10)
    result shouldBe "Fake Save Mock!"
  }

  "Save 10 but new mock" in {
    val newMockSave=mock(classOf[helperClass])
    when(newMockSave.storeStuff(anyInt)).thenReturn("Fake Save new Mock!")

    val y=new TestClass {
      override def caching: helperClass = newMockSave
    }
    val result = y.save(10)
    result shouldBe "Fake Save new Mock!"
  }
}
