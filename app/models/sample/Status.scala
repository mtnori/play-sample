package models.sample

sealed abstract class Status
object Status {
  final case object Ok extends Status
  final case object Nok extends Status
}

object main extends App {
  println(List(Status.Ok, Status.Nok))
}
