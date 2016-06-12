package com.tpg.pbs.hartals

sealed abstract class WeekDay(val n: Int, code: String) {
}

case class Sunday(override val n: Int) extends WeekDay(1, "Su") {}
case class Monday(override val n: Int) extends WeekDay(2, "Mo") {}
case class Tuesday(override val n: Int) extends WeekDay(3, "Tu") {}
case class Wednesday(override val n: Int) extends WeekDay(4, "We") {}
case class Thursday(override val n: Int) extends WeekDay(5, "Th") {}
case class Friday(override val n: Int) extends WeekDay(6, "Fr") {}
case class Saturday(override val n: Int) extends WeekDay(7, "Sa") {}

object WeekDay {
  def apply(n: Int) : WeekDay = ((n-1) % 7) match {
    case 0 => Sunday(n)
    case 1 => Monday(n)
    case 2 => Tuesday(n)
    case 3 => Wednesday(n)
    case 4 => Thursday(n)
    case 5 => Friday(n)
    case 6 => Saturday(n)
  }
}

