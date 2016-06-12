package com.tpg.pbs.hartals

import org.scalatest.{MustMatchers, FunSpec}

import scala.collection.immutable.ListMap

class PoliticalPartySpec extends FunSpec with MustMatchers {
  describe("a political party") {
    describe("determine the number of working days lost in N days") {
      it("Hartal falls on a friday") {
        val party = PoliticalParty("2", HartalParameter(3), N(14))

        val expectedHartalDays = Seq(3, 6, 9, 12) map { i => WeekDay(i) -> HartalDay } toMap

        party.sortedByWeekDay filter { p => p._2 == HartalDay } must be(ListMap(expectedHartalDays.toSeq.sortBy(_._1.n): _*))

        party.daysLostToHartals must be(3)
      }

      it("Hartal falls on a saturday") {
        val party = PoliticalParty("2", HartalParameter(7), N(14))

        val expectedHartalDays = Seq(7, 14) map { i => WeekDay(i) -> HartalDay } toMap

        party.sortedByWeekDay filter { p => p._2 == HartalDay } must be(ListMap(expectedHartalDays.toSeq.sortBy(_._1.n): _*))

        party.daysLostToHartals must be(0)
      }
    }
  }
}
