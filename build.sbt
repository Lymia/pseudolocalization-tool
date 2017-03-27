organization := "moe.lymia"
name := "pseudolocalization-tool"
homepage := Some(url("https://code.google.com/archive/p/pseudolocalization-tool/"))
licenses := Seq("Apache License 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))
version := "0.2"
crossPaths := false

libraryDependencies in Test += "junit" % "junit" % "4.10"
libraryDependencies += "org.htmlparser" % "htmlparser" % "2.1"
