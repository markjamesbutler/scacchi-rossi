package it.alese.scacchirossi.board

case class Row(index: Int) {
  require(1 to 8 contains index)
}

object Row {
  val validRows = 1 to 8 map(i => Row(i))
}
