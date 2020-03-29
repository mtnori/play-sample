package models.sample

import org.scalatest._
import service.sample.ShapeService

class ShapeServiceSpec extends FlatSpec {
  "calcArea" should "return 3.14" in {
    val service = new ShapeService()
    val c = Circle(1)
    assert(service.calcArea(c) == 3.14)
  }

  it should "return 200" in {
    val service = new ShapeService()
    val r = Rectangle(10, 20)
    assert(service.calcArea(r) == 200)
  }
}
