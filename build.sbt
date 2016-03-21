organization := "com.thenewmotion"

name := "mobilityid"

enablePlugins(OssLibPlugin)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.7.2" % "test"
)

licenses += ("Apache License, Version 2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
