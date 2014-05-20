package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  println("\nNegative Integers:")
  printSet(negativeIntegers())

  println("\nUnion of Negative Integers and {6}:")
  printSet(union(negativeIntegers(), singletonSet(6)))

  println("\nUnion of Negative Integers and Positive Integers:")
  printSet(union(negativeIntegers(), positiveIntegers()))

  println("\nIntersection of Negative Integers and {-6}:")
  printSet(intersect(negativeIntegers(), singletonSet(-6)))

  println("\nIntersection of Negative Integers and Positive Integers:")
  printSet(intersect(negativeIntegers(), positiveIntegers()))

  println("\nNegative Integers that match x => x % 2 == 0")
  printSet(filter(negativeIntegers(), x => x % 2 == 0))

  println("\nNegative Integers satisfy condition x => x < 0:")
  println(forall(negativeIntegers(), x => x < 0))

  println("\nNegative Integers satisfy condition x => x == 0:")
  println(forall(negativeIntegers(), x => x == 0))

  println("\nSingleton {5} satisfy condition x => x == 0:")
  println(forall(singletonSet(5), x => x == 0))

  println("\nSingleton {5} satisfy condition x => x > 0:")
  println(forall(singletonSet(5), x => x > 0))

  println("\nExists Negative Integers satisfy condition x => x < -7:")
  println(exists(negativeIntegers(), x => x < -7))

  println("\nExists Negative Integers satisfy condition x => x == 0:")
  println(exists(negativeIntegers(), x => x == 0))

  println("\nExists Singleton {5} satisfy condition x => x == 0:")
  println(exists(singletonSet(5), x => x == 0))

  println("\nExists Singleton {5} satisfy condition x => x > 0:")
  println(exists(singletonSet(5), x => x > 0))

  // (x: Int) => x > 0
  // -4 -3 -2 -1 0 1 2 3 4
  // 1 2 3 4
  printSet(positiveIntegers())
  // -4 -3 -2 -1 0 1 2 3 4
  // -8 -6 -4 -2 0 2 4 6 8
  // 2 4
  printSet(map(positiveIntegers(), y => y * 2))

}
