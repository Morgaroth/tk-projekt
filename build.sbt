import AssemblyKeys._

name := "tk-projekt"

version := "1.0.0"

scalaVersion := "2.10.4"

antlr4Settings

assemblySettings

jarName in assembly := "simplifier.jar"

mainClass in assembly := Some("runner.Runner")
