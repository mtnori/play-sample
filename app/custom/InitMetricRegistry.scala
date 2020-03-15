package custom

import com.kenshoo.play.metrics.Metrics
import com.zaxxer.hikari.HikariDataSource
import javax.inject.{Inject, Singleton}
import play.api.db.DBApi

@Singleton
class InitMetricRegistry @Inject()(dbApi: DBApi, metrics: Metrics) {
  val ds: HikariDataSource =
    dbApi.database("default").dataSource.asInstanceOf[HikariDataSource]
  ds.setMetricRegistry(metrics.defaultRegistry)
}
