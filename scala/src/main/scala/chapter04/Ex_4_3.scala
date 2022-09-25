package chapter04

object Ex_4_3 {
  def main(args: Array[String]): Unit = {
    val 사과 = Fruit2("홍옥 사과")
    println(사과.name)
  }
}

case class Fruit2(name: String)