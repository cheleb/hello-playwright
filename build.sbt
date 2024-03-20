val scala3Version = "3.3.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-playwright",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    scalafmtOnCompile := true,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M10" % Test,
    libraryDependencies += "com.microsoft.playwright" % "playwright" % "1.41.1"
  )
