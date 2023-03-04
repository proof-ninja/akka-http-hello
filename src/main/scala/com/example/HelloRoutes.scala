package com.example

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

class HelloRoutes() {

  def getHello(): String = "hello"

  val helloRoute: Route =
    pathEnd {
      get {
        complete(getHello())
      }
    }
}
