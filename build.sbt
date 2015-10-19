import play.PlayJava

val appName         = "Play2EContabilidad"
val appVersion      = "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

 
libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
)

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"
