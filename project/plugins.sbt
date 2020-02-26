// testing for sbt plugins
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value


addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.0")

//addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.0")
//addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")
