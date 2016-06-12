package com.tpg.pbs.hartals

sealed trait LabourDay {
}

object WorkingDay extends LabourDay {
  override def toString = "working day"
}

object HartalDay extends LabourDay {
  override def toString = "hartal day"
}

