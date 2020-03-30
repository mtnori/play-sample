package models.sample

import io.circe._
import io.circe.parser._
import io.circe.syntax._
import models.sample.Event.Foo
import org.scalatest._

import GenericDerivation._

class ParseSpec extends FlatSpec {
  "parse" should "success" in {
    val rawJson: String = """
    {
      "foo": "bar",
      "baz": 123,
      "list of stuff": [ 4, 5, 6 ]
    }
    """
    val parseResult = parse(rawJson)
    println(parseResult)
  }

  it should "success2" in {
    // JSONからデコード
    assert(decode[Event]("""{ "i": 1000 }""") == Right(Foo(1000)))

    // JSONにエンコード
    assert((Foo(100): Event).asJson.noSpaces == """{"i":100}""")
  }
}
