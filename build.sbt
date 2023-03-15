inThisBuild(
  List(
    organization := "io.github.ablearthy",
    homepage := Some(url("https://github.com/ablearthy/td-types-generator")),
    licenses := List(
      "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
    ),
    developers := List(
      Developer(
        "ablearthy",
        "Able Arthy",
        "ablearthy@gmail.com",
        url("https://github.com/ablearthy")
      )
    ),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/ablearthy/td-types-generator"),
        "scm:git@github.com:ablearthy/td-types-generator.git"
      )
    )
  )
)

ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

val circeVersion = "0.14.1"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "td-types-generator",
    sbtPlugin := true,
    versionScheme := Some("semver-spec"),
    libraryDependencies += "com.lihaoyi" %% "fastparse" % "2.3.3",
    libraryDependencies += "io.github.ablearthy" %% "td-tl-parser" % "1.0.3",
    libraryDependencies += "org.scalameta" %% "scalameta" % "4.7.5",
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser"
    ).map(_ % circeVersion)
)
