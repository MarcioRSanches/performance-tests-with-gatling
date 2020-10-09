package scenarios

import requests.AccessUolHomePageRequest
import io.gatling.core.Predef._

object AccessUolHomePage {
  val accessUolHomePage = scenario("Access Uol Home Page")
                            .exec(AccessUolHomePageRequest.access_home)
}