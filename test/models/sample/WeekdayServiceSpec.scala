package models.sample

import org.scalatest._
import service.sample.WeekdayService

class WeekdayServiceSpec extends FlatSpec {
  "weekdayToNum" should "return 1" in {
    val monday: Weekday = Monday
    val weekdayService = new WeekdayService()
    assert(weekdayService.weekdayToNum(monday) == 1)
  }
}
