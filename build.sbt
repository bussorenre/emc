
ThisBuild / organization := "com.bussorenre"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version      := "0.1.0-SNAPSHOT"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

lazy val root = (project in file("."))
  .settings(
    name := "emc",
    libraryDependencies += scalaTest % Test
  )

lazy val agent = (project in file("modules/agent"))
  .dependsOn(shared)
  .settings(
    name := "emc-agent",
    libraryDependencies += scalaTest % Test
  )


lazy val shared = (project in file("modules/shared"))
  .settings(
    name:= "emc-shared",
    libraryDependencies += scalaTest % Test
  )
