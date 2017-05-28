organization := "tv.cntt"
name         := "sinetja-skeleton"
version      := "1.0-SNAPSHOT"

//------------------------------------------------------------------------------

// Only use SBT as a build tool
scalaVersion := "2.12.2"
autoScalaLibrary := false

// Do not append Scala versions to the generated artifacts
crossPaths := false

// Java 8 style
javacOptions in Compile ++= Seq("-source", "1.6", "-target", "1.6", "-Xlint:deprecation")
javacOptions in (Compile, doc) := Seq("-source", "1.6")

//------------------------------------------------------------------------------

libraryDependencies += "tv.cntt" % "sinetja" % "1.4.0"

// Sinetja uses SLF4J, an implementation of SLF4J is needed
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.2"

// For writing condition in logback.xml
libraryDependencies += "org.codehaus.janino" % "janino" % "2.7.5"

// Put config directory in classpath for easier development --------------------

// For "sbt console"
unmanagedClasspath in Compile += Attributed.blank(baseDirectory.value / "config")

// For "sbt run"
unmanagedClasspath in Runtime += Attributed.blank(baseDirectory.value / "config")

// Copy these to target/xitrum when sbt xitrum-package is run
XitrumPackage.copy("config", "public", "script")
