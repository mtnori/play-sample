package models.sample

final case class Command(label: String,
                         meters: Option[Int],
                         degrees: Option[Int])

sealed abstract class Command2 extends Product with Serializable
object Command {
  case class Move(meters: Int) extends Command2
  case class Rotate(degrees: Int) extends Command2
}

sealed abstract class SettingJson extends Product with Serializable
object SettingJson {
  case class Setting1(setting1: Int)
  case class Setting2(setting2: Int)
  case class Setting3(setting3: Int)
}
