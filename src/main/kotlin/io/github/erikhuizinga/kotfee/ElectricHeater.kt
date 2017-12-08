package io.github.erikhuizinga.kotfee

/** Created by Erik Huizinga on 7-12-17 */
class ElectricHeater : Heater {
  var heating: Boolean = false

  override fun on() {
    println("~ ~ ~ heating ~ ~ ~")
    heating = true
  }

  override fun off() {
    heating = false
  }

  override fun isHot() = heating
}
