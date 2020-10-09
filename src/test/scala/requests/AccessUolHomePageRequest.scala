package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object AccessUolHomePageRequest {

  val access_home = exec(http("Access Uol Home Page Request")
    .get("/")
    .check(status is 200))
}