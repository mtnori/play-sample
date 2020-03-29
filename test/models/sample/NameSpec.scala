package models.sample

import org.scalatest._

class NameSpec extends FlatSpec {
  "lastName" should "Dylan" in {
    val bob = Name("Bob", "Dylan")
    assert(bob.lastName == "Dylan")
  }
}
