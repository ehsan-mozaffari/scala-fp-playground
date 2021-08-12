package com.example.api.route

import cats.effect.Async
import cats.implicits.toSemigroupKOps
import com.example.api.domain.{HelloWorld, Jokes}
import org.http4s.client.Client

object Route {

  def apply[F[_]: Async](client: Client[F]) = {
    val helloWorldAlg = HelloWorld.impl[F]
    val jokeAlg = Jokes.impl[F](client)

    Http4sRoute.helloWorldRoutes[F](helloWorldAlg) <+>
      Http4sRoute.jokeRoutes[F](jokeAlg)
  }

}
