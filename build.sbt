ThisBuild / version := "1.0.0"
ThisBuild / organization := "io.github.ablearthy"

val circeVersion = "0.14.1"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "td-tl-types-generator",
    sbtPlugin := true,
    libraryDependencies += "io.github.ablearthy" %% "td-tl-parser" % "1.0.0",
    libraryDependencies += "org.scalameta" %% "scalameta" % "4.7.5",
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser"
    ).map(_ % circeVersion)
)
