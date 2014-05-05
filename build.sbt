import sbtassembly.Plugin.AssemblyKeys
import AssemblyKeys._

name := "tk-projekt"

version := "1.0.0"

scalaVersion := "2.10.4"

antlr4Settings

antlr4GenListener in Antlr4 := false

antlr4GenVisitor in Antlr4 := true

antlr4PackageName in Antlr4 := Some("parser")

antlr4OutputDir in Antlr4 := (javaSource in Compile).value

assemblySettings

jarName in assembly := "simplifier.jar"

mainClass in assembly := Some("runner.Runner")
