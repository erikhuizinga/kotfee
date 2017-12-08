package io.github.erikhuizinga.kotfee

/** Created by Erik Huizinga on 7-12-17 */
interface Heater {
  fun on()
  fun off()
  fun isHot(): Boolean
}
