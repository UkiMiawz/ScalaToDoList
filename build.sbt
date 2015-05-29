name := """scala-to-do-list"""

version := "1.0"

scalaVersion := "2.11.5"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.play" %% "anorm" % "2.3.6",
  "org.scaldi" %% "scaldi-play" % "0.5.5"
)

fork in run := true
