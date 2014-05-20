package recfun

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else if (c < 0 || r < 0)
      0
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)

  }

  /**
   * (if (zero? x) max (/ 1 x))
   * (zero? x) max (/ 1 x)
   * ) max (
   * max
   *
   * (if (zero? x) max (/ 1 x)
   * (zero? x) max (
   */

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def doBalance(depth: Int, chars: List[Char]): Boolean = {
      if (depth < 0)
        false
      else if (chars.isEmpty)
        depth == 0 // When the string terminates, there should be no brackets left
      else if (chars.head == '(')
        // push one
        doBalance(depth + 1, chars.tail)
      else if (chars.head == ')')
        // pop one
        doBalance(depth - 1, chars.tail)
      else
        doBalance(depth, chars.tail)
    }

    doBalance(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0 || coins.size == 0) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
