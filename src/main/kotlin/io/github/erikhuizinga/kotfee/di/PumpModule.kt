package io.github.erikhuizinga.kotfee.di

import dagger.Binds
import dagger.Module
import io.github.erikhuizinga.kotfee.Pump
import io.github.erikhuizinga.kotfee.ThermoSiphon

/** Created by Erik Huizinga on 7-12-17 */
@Module
abstract class PumpModule {
  @Binds abstract fun providePump(pump: ThermoSiphon): Pump
}
