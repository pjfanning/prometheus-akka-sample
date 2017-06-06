# prometheus-akka-sample

This sample demonstrates how to add [Prometheus-Akka](https://github.com/Workday/prometheus-akka) metrics to your application.
All you need to do is add a dependency on the prometheus-akka jar, add some configuration to your application.conf and to enable apectjweaver.

```sbt run```

This sample uses [sbt-aspectj-runner](https://github.com/kamon-io/sbt-aspectj-runner) to enable apectjweaver.
This plugin basically adds this to the java runtime command.

```-javaagent:/path/to/aspectjweaver-1.8.10.jar```

To query the metrics endpoint, use:

```curl http://localhost:12345/metrics```

## Grafana

If you want to visualise the metrics, you could try [Grafana](http://docs.grafana.org/).
The Prometheus website has a [page](https://prometheus.io/docs/visualization/grafana/) about setting up Prometheus Server to scrape your metrics and how to integrate this with Grafana.
