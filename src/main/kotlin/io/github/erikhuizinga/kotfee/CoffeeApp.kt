package io.github.erikhuizinga.kotfee

import dagger.Component
import io.github.erikhuizinga.kotfee.di.DripCoffeeModule
import javax.inject.Singleton

/** Created by Erik Huizinga on 7-12-17 */
object CoffeeApp {
  @Singleton
  @Component(modules = [DripCoffeeModule::class])
  interface Coffeeshop {
    fun maker(): CoffeeMaker
  }

  @JvmStatic
  fun main(args: Array<String>) {
    DaggerCoffeeApp_Coffeeshop.builder().build().maker().brew()
  }
}
