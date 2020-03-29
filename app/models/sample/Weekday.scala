package models.sample

// SUM ADT
// 列挙型の本体
sealed trait Weekday

// 具体的な列挙値
case object Sunday extends Weekday
case object Monday extends Weekday
case object Tuesday extends Weekday
case object Wednesday extends Weekday
case object Thursday extends Weekday
case object Friday extends Weekday
case object Saturday extends Weekday
