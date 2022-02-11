// DO NOT EDIT! This file is auto-generated.

// This plugin enables semantic information to be produced by sbt.
// It also adds support for debugging using the Debug Adapter Protocol
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
addSbtPlugin("org.scalameta" % "sbt-metals" % "0.11.1+97-0ef9a93b-SNAPSHOT")

// This plugin adds the BSP debug capability to sbt server.

addSbtPlugin("ch.epfl.scala" % "sbt-debug-adapter" % "2.0.12")

