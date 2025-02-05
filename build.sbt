val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-playwright",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    scalafmtOnCompile := true,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.4" % Test,
    libraryDependencies += "com.microsoft.playwright" % "playwright" % "1.50.0"
  )
