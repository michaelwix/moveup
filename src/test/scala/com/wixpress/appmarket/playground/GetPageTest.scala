package com.wixpress.appmarket.playground

import org.specs2.mutable.SpecWithJUnit

class GetPageTest extends SpecWithJUnit {

  import MoveUp._

  "getPage of empty" >> {
    val page = getPage(Nil, PageParam(offset = 0, limit = 3))
    page must beEmpty
  }

  "getPage offset 0, size = 3" >> {
    val page = getPage((0 until 10).toList, PageParam(offset = 0, limit = 3))
    page must beEqualTo(Seq(0, 1, 2))
  }

  "getPage offset 3, size = 3" >> {
    val page = getPage((0 until 10).toList, PageParam(offset = 3, limit = 3))
    page must beEqualTo(Seq(3, 4, 5))
  }

  "getPage offset 9, size = 3" >> {
    val page = getPage((0 until 10).toList, PageParam(offset = 9, limit = 3))
    page must beEqualTo(Seq(9))
  }

  "getPage offset 10, size = 3" >> {
    val page = getPage((0 until 10).toList, PageParam(offset = 10, limit = 3))
    page must beEmpty
  }
}
