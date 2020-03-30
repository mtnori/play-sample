package models.sample

sealed abstract class Event extends Product with Serializable

object Event {
  final case class Foo(i: Int) extends Event
  final case class Bar(s: String) extends Event
  final case class Baz(c: Char) extends Event
  final case class Qux(values: List[String]) extends Event
}

import cats.syntax.functor._
import io.circe.{Decoder, Encoder}
import io.circe.generic.auto._
import io.circe.syntax._

object GenericDerivation {
  import models.sample.Event._
  implicit val encodeEvent: Encoder[Event] = Encoder.instance {
    case foo @ Foo(_) => foo.asJson
    case bar @ Bar(_) => bar.asJson
    case baz @ Baz(_) => baz.asJson
    case qux @ Qux(_) => qux.asJson
  }

  implicit val decodeEvent: Decoder[Event] =
    List[Decoder[Event]](
      Decoder[Foo].widen,
      Decoder[Bar].widen,
      Decoder[Baz].widen,
      Decoder[Qux].widen
    ).reduceLeft(_ or _)
}
