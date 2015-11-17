name := "lightning-scala"

version := "0.3"

scalaVersion := "2.11.7"

homepage := Some(url("http://lightning-viz.org"))

description := "Scala client for interactive data visualization with Lightning."

organization := "org.lightning-viz"

organizationName := "lightning-viz"

organizationHomepage := Some(url("https://github.com/lightning-viz"))

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.0.0"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.3.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4"




