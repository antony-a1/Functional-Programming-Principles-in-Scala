import streams.Bloxorz.{Level1, Level0}
import streams.Bloxorz.Level1._
//Level0.startPos
//Level0.goal
//Level0.startBlock
//Level0.startBlock.neighbors
//Level0.startBlock.legalNeighbors
//Level0.done(Level0.startBlock)
//Level0.done(Level0.startBlock.down.right.up)
val xx =
  """ooo-------
    |oSoooo----
    |ooooooooo-
    |-ooooooooo
    |-----ooToo
    |------ooo-""".stripMargin
val yy =
  """------
    |--ST--
    |--oo--
    |--oo--
    |------""".stripMargin
Level1.startPos
Level1.startBlock // Block(Pos(1,1),Pos(1,1))
//val v = Level1.neighborsWithHistory(Level1.startBlock, zList(Left,Up))
//Level1.pathsFromStart.take(10).toList
//Level1.pathsToGoal.toList
Level1.solution
Level1.solutions.take(10).toList
