name := """ekam"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  jdbc,
  filters,
  "mysql" % "mysql-connector-java" % "5.1.34",
  "com.nimbusds" % "nimbus-jose-jwt" % "3.10",
  "commons-codec" % "commons-codec" % "1.9",
  "net.jcip" % "jcip-annotations" % "1.0",
  "net.minidev" % "json-smart" % "1.3.1",
  "org.bouncycastle" % "bcprov-jdk15on" % "1.52",
  "net.sf.flexjson" % "flexjson" % "3.2",
  "javax.ws.rs" % "javax.ws.rs-api" % "2.0.1",
  "org.glassfish.hk2" % "hk2-api" % "2.4.0-b25",
  "javax.inject" % "javax.inject" % "1",
  "org.glassfish.hk2" % "hk2-utils" % "2.4.0-b25",
  "org.glassfish.hk2" % "osgi-resource-locator" % "1.0.1",
  "org.glassfish.hk2.external" % "aopalliance-repackaged" % "2.4.0-b25",
  "org.glassfish.jersey.core" % "jersey-client" % "2.18",
  "org.glassfish.jersey.core" % "jersey-common" % "2.18",
  "org.glassfish.jersey.bundles.repackaged" % "jersey-guava" % "2.17",
  "org.json" % "json" % "20141113",
  "org.scala-lang" % "scala-library" % "2.11.7",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.paypal.sdk" % "rest-api-sdk" % "1.2.5",
  "com.sendgrid" % "sendgrid-java" % "2.2.2",
  "com.sendgrid" % "smtpapi-java" % "1.2.0",
  "org.apache.commons" % "commons-collections4" % "4.1",
  "org.apache.httpcomponents" % "httpclient" % "4.3.4",
  "commons-logging" % "commons-logging" % "1.1.3",
  "org.apache.httpcomponents" % "httpcore" % "4.3.2",
  "org.apache.httpcomponents" % "httpmime" % "4.3.4",
  "org.apache.poi" % "poi-excelant" % "3.12",
  "org.apache.poi" % "poi-ooxml" % "3.12",
  "org.apache.poi" % "poi-ooxml-schemas" % "3.12",
  "org.apache.poi" % "poi" % "3.12",
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  "org.powermock" % "powermock-api-mockito" % "1.6.4" % "test",
  "org.powermock" % "powermock-module-junit4" % "1.6.4" % "test"
)
