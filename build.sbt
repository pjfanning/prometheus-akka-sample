name := "prometheus-akka-sample"

scalaVersion := "2.12.2"

resolvers += "jitpack" at "https://jitpack.io"

val akkaVersion = "2.5.2"
val akkaHttpVersion = "10.0.7"

libraryDependencies ++= Seq(
  "com.github.pjfanning" %% "prometheus-akka" % "0.7.0-rc2",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
