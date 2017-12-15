name := "prometheus-akka-sample"

scalaVersion := "2.12.4"

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += "Spring Milestone Repository" at "http://repo.spring.io/milestone"

val akkaVersion = "2.5.8"
val akkaHttpVersion = "10.0.11"
val aspectJVersion = "1.9.0.RC2"

enablePlugins(JavaAgent)
javaAgents += "org.aspectj" % "aspectjweaver" % aspectJVersion % "runtime"

libraryDependencies ++= Seq(
  "com.workday" %% "prometheus-akka" % "0.8.2",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "org.aspectj" % "aspectjweaver" % aspectJVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
