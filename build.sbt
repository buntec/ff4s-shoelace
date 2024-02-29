Global / onChangedBuildSource := ReloadOnSourceChanges
Global / resolvers += "Sonatype S01 OSS Snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots"

ThisBuild / tlBaseVersion := "0.0"

lazy val scala213 = "2.13.12"
lazy val scala3 = "3.3.1"
ThisBuild / scalaVersion := scala3
ThisBuild / crossScalaVersions := Seq(scala213, scala3)

ThisBuild / organization := "io.github.buntec"
ThisBuild / organizationName := "buntec"
ThisBuild / startYear := Some(2024)
ThisBuild / tlSonatypeUseLegacyHost := false
ThisBuild / licenses := Seq(License.MIT, License.Apache2)
ThisBuild / tlCiHeaderCheck := false
ThisBuild / tlCiDependencyGraphJob := false

ThisBuild / developers := List(tlGitHubDev("buntec", "Christoph Bunte"))

ThisBuild / tlFatalWarnings := false
ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("11"))

lazy val generateShoelace = taskKey[Unit]("generates the component definitions")

lazy val ff4sVersion = "0.24.0"
lazy val scalajsDomVersion = "2.8.0"
lazy val circeVersion = "0.14.6"
lazy val catsVersion = "2.10.0"
lazy val catsEffectVersion = "3.5.3"
lazy val fs2Version = "3.9.4"
lazy val kindProjectorVersion = "0.13.2"
lazy val betterMonadicForVersion = "0.3.1"
lazy val fs2DomVersion = "0.2.1"
lazy val monocleVersion = "3.2.0"

lazy val root =
  tlCrossRootProject.aggregate(`ff4s-shoelace`, examples)

lazy val `ff4s-shoelace` = (project in file("ff4s-shoelace"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    generateShoelace := {
      new ShoelaceGenerator(
        onlineSourceRoot =
          "https://github.com/buntec/ff4s-shoelace/blob/master",
        customElementsJsonPath =
          "node_modules/@shoelace-style/shoelace/dist/custom-elements.json",
        baseOutputDirectoryPath = "ff4s-shoelace/src/main/scala/ff4s/shoelace",
        baseOutputPackagePath = "ff4s.shoelace"
      ).generate()
    }
  )
  .settings(
    name := "ff4s-shoelace",
    libraryDependencies ++= Seq(
      "io.github.buntec" %%% "ff4s" % ff4sVersion,
      "org.scala-js" %%% "scalajs-dom" % scalajsDomVersion
    )
  )

lazy val examples = (project in file("examples"))
  .enablePlugins(ScalaJSPlugin, NoPublishPlugin)
  .settings(
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "io.github.buntec" %%% "ff4s" % ff4sVersion,
      "org.scala-js" %%% "scalajs-dom" % scalajsDomVersion,
      "com.armanbilge" %%% "fs2-dom" % fs2DomVersion,
      "org.typelevel" %%% "cats-core" % catsVersion,
      "org.typelevel" %%% "cats-effect" % catsEffectVersion,
      "org.typelevel" %%% "cats-effect-kernel" % catsEffectVersion,
      "org.typelevel" %%% "cats-effect-std" % catsEffectVersion,
      "co.fs2" %%% "fs2-core" % fs2Version,
      "dev.optics" %%% "monocle-core" % monocleVersion,
      "dev.optics" %%% "monocle-macro" % monocleVersion
    )
  )
  .dependsOn(`ff4s-shoelace`)
