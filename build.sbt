organization := "it.nerdammer.bigdata"

name := "spark-hbase-connector"

version := "1.0.4"

scalaVersion := "2.11.12"

libraryDependencies +=  "org.apache.spark" % "spark-core_2.11" % "2.2.0" withSources() withJavadoc()

libraryDependencies +=  "org.apache.hbase" % "hbase-common" % "1.3.1" withSources() withJavadoc() excludeAll(ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty", name="jetty"), ExclusionRule(organization = "org.mortbay.jetty", name="servlet-api-2.5"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"))

libraryDependencies +=  "org.apache.hbase" % "hbase-client" % "1.3.1" withSources() withJavadoc() excludeAll(ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty", name="jetty"), ExclusionRule(organization = "org.mortbay.jetty", name="servlet-api-2.5"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"))

libraryDependencies +=  "org.apache.hbase" % "hbase-server" % "1.3.1" withSources() withJavadoc() excludeAll(ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty", name="jetty"), ExclusionRule(organization = "org.mortbay.jetty", name="servlet-api-2.5"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"))

libraryDependencies +=  "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"

enablePlugins(PackPlugin)
