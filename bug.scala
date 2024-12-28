```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) x  //This will cause an ArithmeticException if x is 0 and y is 0. 
    else x / y 
  }
}
```