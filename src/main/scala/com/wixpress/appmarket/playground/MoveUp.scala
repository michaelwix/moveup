package com.wixpress.appmarket.playground

object MoveUp {

  case class PageParam(offset: Int, limit: Int)

  case class ItemToMoveUp(x: Int, position: Int)

  def getPage(xs: Seq[Int], pageParam: PageParam): Seq[Int] = ???

  def getPageAndMoveUp(xs: Seq[Int], pageParam: PageParam, itemToMoveUp: ItemToMoveUp): Seq[Int] = ???
}