package models.sample

// SUM ADTとPRODUCT ADTの複合
sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape
