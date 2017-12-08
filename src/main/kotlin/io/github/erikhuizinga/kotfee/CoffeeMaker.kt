package io.github.erikhuizinga.kotfee

import dagger.Lazy
import javax.inject.Inject

/** Created by Erik Huizinga on 7-12-17 */

class CoffeeMaker @Inject constructor(private val heater: Lazy<Heater>, private val pump: Pump) {
  fun brew() {
    heater.get().on()
    pump.pump()
    println(" [_]P coffee! [_]P ")
    heater.get().off()
  }
}
