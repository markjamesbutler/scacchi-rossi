package it.alese.scacchirossi.scacchirossi.board

import it.alese.scacchirossi.scacchirossi.LetterToIntMap

case class Column(index: Char) {
  require('A' to 'H' contains index)
  def toInt = {
    LetterToIntMap(index)
  }
  def toChar: Char = {
    index
  }
}

object Column {
  val validColumns = 'A' to 'H' map (i => Column(i))
  def apply(x: Int): Column = {
    new Column(LetterToIntMap(x))
  }
}
