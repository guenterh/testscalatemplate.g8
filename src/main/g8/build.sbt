scalaVersion := "2.13.0"

libraryDependencies += "io.monix" %% "minitest" % "2.5.0" % "test"

testFrameworks += new TestFramework("minitest.runner.Framework")
