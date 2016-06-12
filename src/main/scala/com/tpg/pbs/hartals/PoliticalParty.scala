package com.tpg.pbs.hartals

import scala.collection.immutable.ListMap
import scala.language.postfixOps

case class N(n: Int) {
  require(n > 0)
}

case class HartalParameter(n: Int) {
  require(n > 0)
}

case class PoliticalParty(id: String, hartalParameter: HartalParameter, n: N) {
  private val days = (1 to n.n) map { i => i % hartalParameter.n match {
      case 0 => WeekDay(i) -> HartalDay
      case _ => WeekDay(i) -> WorkingDay
    }
  } toSeq

  val sortedByWeekDay: Map[WeekDay, LabourDay] = ListMap(days.sortBy(_._1.n): _*)

  val daysLostToHartals: Int = sortedByWeekDay count(entry => entry._2 == HartalDay &&
    !(entry._1.isInstanceOf[Friday] || entry._1.isInstanceOf[Saturday]))

  override def toString = s"party $id"
}
