package com.tpg.pbs.hartals

import org.scalatest.{MustMatchers, FunSpec}

class WeekDaySpec extends FunSpec with MustMatchers {
  describe("week days") {
    describe("sunday") {
      it("has position where (n-1) % 7 = 0") {
        val indices = Seq(1, 8)

        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map {i => Sunday(i) }

        days must be(expectedDays)
      }
    }

    describe("monday") {
      it("has position where (n-1) % 7 = 1") {
        val indices = Seq(2, 9)

        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map {i => Monday(i) }

        days must be(expectedDays)
      }
    }

    describe("tuesday") {
      it("has position where (n-1) % 7 = 2") {
        val indices = Seq(3, 10)

        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map {i => Tuesday(i) }

        days must be(expectedDays)
      }
    }

    describe("wednesday") {
      it("has position where (n-1) % 7 = 3") {
        val indices = Seq(4, 11)
        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map { i => Wednesday(i) }

        days must be(expectedDays)
      }
    }

    describe("thursday") {
      it("has position where (n-1) % 7 = 4") {
        val indices = Seq(5, 12)

        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map { i => Thursday(i) }

        days must be(expectedDays)
      }
    }

    describe("friday") {
      it("has position where (n-1) % 7 = 5") {
        val indices = Seq(6, 13)

        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map { i => Friday(i) }

        days must be(expectedDays)
      }
    }

    describe("saturday") {
      it("has position where (n-1) % 7 = 6") {
        val indices = Seq(7, 14)

        val days = indices map { i => WeekDay(i) }
        val expectedDays = indices map { i => Saturday(i) }

        days must be(expectedDays)
      }
    }
  }
}
