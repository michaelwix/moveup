package com.wixpress.appmarket.playground

object MoveUp {

  def moveUp(xs: Seq[Int], x: Int, pos: Int): Seq[Int] = {
    val (front, back) = xs.splitAt(pos)
    front ++ Seq(x) ++ (if (back.contains(x)) back.filter(_ != x) else back.dropRight(1))
  }

  def shiftTo(xs: Seq[Int], offset: Int, limit: Int, x: Int): Seq[Int] = {
    val slice = xs.slice(offset - 1, offset + limit)
    val (front, back) = slice.span(_ != x)
    front ++ back.drop(1)
  }

  def getPageAndMoveUp(xs: Seq[Int], offset: Int, limit: Int, x: Int, pos: Int): Seq[Int] = {
    if ((offset until offset + limit).contains(pos)) {
      val page = xs.slice(offset, offset + limit)
      moveUp(page, x, pos)
    } else shiftTo(xs, offset, limit, x)
  }
}
