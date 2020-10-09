package config

import io.gatling.core.Predef._
import io.gatling.http.Predef.http

object Config {
  val httpProtocol = http.baseUrl("http://uol.com.br")

  val users = Integer.getInteger("users", 1).toInt
  val rampup = Integer.getInteger("rampup", 1).toInt
  val duration = Integer.getInteger("duration", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
}