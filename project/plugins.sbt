addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.2")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.17")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.25")

ThisBuild / libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-io" % "1.3.2",
  "io.github.java-diff-utils" % "java-diff-utils" % "4.9"
)
