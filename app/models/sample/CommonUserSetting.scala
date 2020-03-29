package models.sample

/**
  * こんな感じに書ける？
  */
sealed abstract class CommonUserSetting extends Product with Serializable
object CommonUserSetting {
  case class MailNotification(isSend: Boolean)
  case class Auth(permissionName: String, permissionValue: Boolean)
}
