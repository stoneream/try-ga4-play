name := """play-api-docs"""
organization := "com.github.ishikawawawa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.7"

val scalikejdbcVersion = "3.5.0"

libraryDependencies ++= Seq(
  guice,
  "mysql" % "mysql-connector-java" % "8.0.27",
  "org.scalikejdbc" %% "scalikejdbc" % scalikejdbcVersion,
  "org.scalikejdbc" %% "scalikejdbc-config" % scalikejdbcVersion,
  "org.scalikejdbc" %% "scalikejdbc-joda-time" % scalikejdbcVersion,
  "org.scalikejdbc" %% "scalikejdbc-play-initializer" % "2.8.0-scalikejdbc-3.5",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.github.ishikawawawa.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.github.ishikawawawa.binders._"

ThisBuild / scalafixScalaBinaryVersion := CrossVersion.binaryScalaVersion(scalaVersion.value)
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafmtOnCompile := true
ThisBuild / Compile / scalacOptions ++= List(
  "-Ywarn-unused",
  "-Yrangepos"
)
