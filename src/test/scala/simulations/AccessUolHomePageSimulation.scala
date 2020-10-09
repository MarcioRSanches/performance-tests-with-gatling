package simulations

import scenarios.AccessUolHomePage
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import config.Config._

import scala.concurrent.duration.DurationInt

class AccessUolHomePageSimulation extends Simulation{
  private val access_pageExec = AccessUolHomePage.accessUolHomePage

  setUp(
    access_pageExec.inject(
      rampUsers(rampup) during(duration seconds))
  ).protocols(httpProtocol)
}