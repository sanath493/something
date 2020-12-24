class Assignment3_Math {

  def add(a: Int, b: Int): Int = { a + b }

  def multiply(a: Int, b: Int): Int = { a * b }

  def subtract(a: Int, b: Int): Int = { a - b }
}

object mathOpsDriver{

  def main(args: Array[String]) {

    val o = new Assignment3_Math()

    println("The sum of 25 and 23 is: " + o.add(23,25))
    println("The difference of 25 and 23 is: " + o.subtract(25,23))
    println("The product of 25 and 23 is:  " + o.multiply(25,23))

  }
}

