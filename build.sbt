ThisBuild / scalaVersion := "2.11.8"
ThisBuild / version := "0.1"

lazy val root = (project in file("."))
  .settings(
    name := "spark-utils",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-sql" % "2.2.2" ,
      "org.apache.spark" %% "spark-core" % "2.2.2",
      "org.apache.hadoop" % "hadoop-common" % "2.7.1",
      "com.beust" % "jcommander" % "1.32"
    )
  )
