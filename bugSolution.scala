```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) {
      if (x == 0) 0 // Or throw an exception, return a default value, etc. 
      else throw new ArithmeticException("Division by zero")
    } else {
      x / y
    }
  }
}
```