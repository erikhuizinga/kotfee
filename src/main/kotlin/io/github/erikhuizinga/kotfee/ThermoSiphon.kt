package io.github.erikhuizinga.kotfee

import javax.inject.Inject

/** Created by Erik Huizinga on 7-12-17 */
class ThermoSiphon @Inject constructor(private val heater: Heater) : Pump {
  override fun pump() {
    if (heater.isHot) println("=> => pumping => =>")
  }
}