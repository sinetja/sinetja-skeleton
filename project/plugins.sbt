// Run sbt eclipse to create Eclipse project file
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")

// Run sbt xitrum-package to prepare for deploying to production environment
addSbtPlugin("tv.cntt" % "xitrum-package" % "1.9")
