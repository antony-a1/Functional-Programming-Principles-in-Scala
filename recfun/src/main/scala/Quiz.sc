object exercise {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b)
      1
    else
      f(a) * product(f)(a + 1, b)
  }
  product(x => x*x)(2, 3)

  def fact(n: Int) = product(x => x)(1, n)

  fact(1)
  fact(2)
  fact(3)
  fact(4)
  fact(5)


}