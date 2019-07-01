package org.linglongxin.core

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object RDDExample {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("RDDExample").setMaster("local")
    val sc = new SparkContext(conf)

    var counter = 0
    val data = Array(1,2,3,4,5)
    var rdd = sc.parallelize(data)

    rdd.foreach(x => counter += x)
    println("counter value" + counter)

  }
}
