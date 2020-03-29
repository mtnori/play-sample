package service.sample

import models.sample.Shape

class ShapeService {
  def calcArea(shape: Shape): Double = {
    import models.sample.{Circle, Rectangle}
    shape match {
      case Circle(r)       => r * r * 3.14
      case Rectangle(w, h) => w * h
    }
  }
}
