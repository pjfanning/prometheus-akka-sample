# prometheus-akka-sample

This sample demonstrates how to add [Prometheus-Akka](https://github.com/Workday/prometheus-akka) metrics to your application.
All you need to do is add a dependency on the prometheus-akka jar, add some configuration to your application.conf and to enable apectjweaver.

```sbt run```

This sample uses [sbt-aspectj-runner](https://github.com/kamon-io/sbt-aspectj-runner) to enable apectjweaver.

```-javaagent:/path/to/aspectjweaver-1.8.10.jar```
