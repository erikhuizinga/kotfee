package io.github.erikhuizinga.kotfee.di

import dagger.Module
import dagger.Provides
import io.github.erikhuizinga.kotfee.ElectricHeater
import io.github.erikhuizinga.kotfee.Heater
import javax.inject.Singleton

/** Created by Erik Huizinga on 7-12-17 */
@Module(includes = [PumpModule::class])
class DripCoffeeModule {
  @Provides
  @Singleton
  fun provideHeater(): Heater = ElectricHeater()
}