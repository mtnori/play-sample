name := """play-sample"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.4.200",
  "org.scalikejdbc" %% "scalikejdbc" % "3.4.1",
  "org.scalikejdbc" %% "scalikejdbc-config" % "3.4.1",
  "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.8.0-scalikejdbc-3.4",
  "io.dropwizard.metrics" % "metrics-core" % "4.0.5",
  "com.kenshoo" %% "metrics-play" % "2.7.3_0.8.2",
  "org.scalikejdbc" %% "scalikejdbc-test" % "3.4.1" % Test
)

enablePlugins(ScalikejdbcPlugin)

javaOptions in Test += "-Dconfig.file=conf/test.conf"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
