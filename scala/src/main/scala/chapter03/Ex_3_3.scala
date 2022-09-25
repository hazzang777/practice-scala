package chapter03

object Ex_3_3 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 10)
      println("x의 값은 " + x)

    for (x <- 1 until 10)
      println("x의 값은 " + x)

    // 이중 반복문
    for (x <- 1 until 5; y <- 1 until 5)
      println(x + "X" + y + "=" + (x * y))

    // 조건으로 걸러낼 수 있음
    for (x <- (1 to 10) if (x % 2 == 0))
      println("짝수는? " + x)
  }
}
