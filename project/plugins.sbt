addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.11")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.13.1")

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.27"
addSbtPlugin("org.scalikejdbc" %% "scalikejdbc-mapper-generator" % "3.5.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.10.4")
