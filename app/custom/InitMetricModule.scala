package custom

import play.api.{Configuration, Environment}
import play.api.inject.Module

class InitMetricModule extends Module {
  def bindings(env: Environment, config: Configuration) =
    Seq(bind[InitMetricRegistry].toSelf.eagerly)
}
