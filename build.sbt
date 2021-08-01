name := "scala-fp-playground"

version := "0.1"

scalaVersion := "2.13.6"

scalafmtOnCompile := true

lazy val root = (project in file("."))
  .settings(libraryDependencies ++= Dependencies.mainDependencies)
