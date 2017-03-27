organization := "moe.lymia"
name := "pseudolocalization-tool"
version := "0.2"

homepage := Some(url("https://code.google.com/archive/p/pseudolocalization-tool/"))
licenses := Seq("Apache License 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))

crossPaths := false

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "org.htmlparser" % "htmlparser" % "2.1"
