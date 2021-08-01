import sbt._

object Dependencies {

  private val Http4sVersion          = "0.23.0"
  private val CirceVersion           = "0.14.1"
  private val MunitVersion           = "0.7.27"
  private val LogbackVersion         = "1.2.5"
  private val MunitCatsEffectVersion = "1.0.5"

  val mainDependencies = Seq(
    "org.http4s"    %% "http4s-ember-server" % Http4sVersion,
    "org.http4s"    %% "http4s-ember-client" % Http4sVersion,
    "org.http4s"    %% "http4s-circe"        % Http4sVersion,
    "org.http4s"    %% "http4s-dsl"          % Http4sVersion,
    "io.circe"      %% "circe-generic"       % CirceVersion,
    "org.scalameta" %% "munit"               % MunitVersion           % Test,
    "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test,
    "ch.qos.logback" % "logback-classic"     % LogbackVersion
  )
}
