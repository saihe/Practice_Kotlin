package saihe.practice.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Nested

class MyClassTest {
  @Nested
  class ReturnString {
    @Nested
    class OK {
      fun normalString() {
        val value = "hoge"
        assertEquals(MyClass().returnString(value), value)
      }
    }

    @Nested
    class NG {
      fun notEqualString() {
        val value = "hoge"
        assertNotEquals(MyClass().returnString(value), value)
      }
    }
  }
}