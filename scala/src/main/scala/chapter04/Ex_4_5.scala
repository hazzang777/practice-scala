package chapter04

object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val 하창현 = new PaidUser("하창현", 26, 'M', 100000000)
    하창현.sayName
    하창현.showMoney
  }
}

class User(name: String, age: Int, sex: Char){
  val sayName: Unit = println("name = " + name)
}

class PaidUser(name: String, age: Int, sex: Char, money: Int) extends User(name, age, sex){
  val showMoney: Unit = println("money = " + money)
}
