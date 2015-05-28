name := """scala-to-do-list"""

version := "1.0"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.play" %% "anorm" % "2.3.6"
)

fork in run := true
