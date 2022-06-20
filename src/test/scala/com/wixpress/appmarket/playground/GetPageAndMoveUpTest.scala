package com.wixpress.appmarket.playground

import org.specs2.mutable.SpecWithJUnit

class GetPageAndMoveUpTest extends SpecWithJUnit {

  import MoveUp._

  "getPageAndMoveUp item 4 to 1, page(0, 3)" >> {
    val page = getPageAndMoveUp(xs = 0 until 10, offset = 0, limit = 3, x = 4, pos = 1)
    page must beEqualTo(Seq(0, 4, 1))
  }

  "getPageAndMoveUp item 2 to 1, page(0, 3)" >> {
    val page = getPageAndMoveUp(xs = 0 until 10, offset = 0, limit = 3, x = 2, pos = 1)
    page must beEqualTo(Seq(0, 2, 1))
  }

  "getPageAndMoveUp item 4 to 1, page(3, 3)" >> {
    val page = getPageAndMoveUp(xs = 0 until 10, offset = 3, limit = 3, x = 4, pos = 1)
    page must beEqualTo(Seq(2, 3, 5))
  }

  "getPageAndMoveUp item 4 to 1, page(6, 3)" >> {
    val page = getPageAndMoveUp(xs = 0 until 10, offset = 6, limit = 3, x = 4, pos = 1)
    page must beEqualTo(Seq(6, 7, 8))
  }

  "getPageAndMoveUp item 6 to 2, page(0, 3)" >> {
    val page = getPageAndMoveUp(xs = 0 until 10, offset = 0, limit = 3, x = 6, pos = 2)
    page must beEqualTo(Seq(0, 1, 6))
  }

  "getPageAndMoveUp item 6 to 2, page(3, 3)" >> {
    val page = getPageAndMoveUp(xs = 0 until 10, offset = 3, limit = 3, x = 6, pos = 2)
    page must beEqualTo(Seq(2, 3, 4))
  }
}
