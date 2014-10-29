organization := "tv.cntt"

name         := "sinetja-skeleton"

version      := "1.0-SNAPSHOT"

//------------------------------------------------------------------------------

scalaVersion := "2.11.2"

autoScalaLibrary := false

// Do not append Scala versions to the generated artifacts
crossPaths := false

// Java 8 style
javacOptions in (Compile) ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint:deprecation")

javacOptions in (Compile, doc) := Seq("-source", "1.8")

//------------------------------------------------------------------------------

libraryDependencies += "tv.cntt" % "sinetja" % "1.2-SNAPSHOT"

// Xitrum uses SLF4J, an implementation of SLF4J is needed
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"

// For writing condition in logback.xml
libraryDependencies += "org.codehaus.janino" % "janino" % "2.7.5"

// Put config directory in classpath for easier development --------------------

// For "sbt console"
unmanagedClasspath in Compile <+= (baseDirectory) map { bd => Attributed.blank(bd / "config") }

// For "sbt run"
unmanagedClasspath in Runtime <+= (baseDirectory) map { bd => Attributed.blank(bd / "config") }

// Copy these to target/xitrum when sbt xitrum-package is run
XitrumPackage.copy("config", "public", "script")
