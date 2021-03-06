name := "bug"

Global / semanticdbEnabled := true

lazy val testcase = (project in file("."))
  .settings(
    scalaVersion := "2.13.7",
    Test/ fork := true,

    libraryDependencies ++= Seq(
      "org.lmdbjava" % "lmdbjava" % "0.8.2",
      "org.scalatest" %% "scalatest" % "3.2.9" % "test"
    )
  )
