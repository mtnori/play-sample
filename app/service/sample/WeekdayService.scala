package service.sample

import models.sample.Weekday

class WeekdayService {
  def weekdayToNum(weekday: Weekday): Int = {
    import models.sample._
    weekday match {
      case Sunday    => 0
      case Monday    => 1
      case Tuesday   => 2
      case Wednesday => 3
      case Thursday  => 4
      case Friday    => 5
      case Saturday  => 6
    }
  }
}
