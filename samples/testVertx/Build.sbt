  name         := "testVertx"
  
  version      := "1.0-SNAPSHOT"

  libraryDependencies ++= Seq(
    // Add your project dependencies here,
    javaCore,
    "playvertx"  % "playvertx_2.10" % "2.1RC1"
  )

  resolvers += Resolver.url("Fred's GitHub Play Repository", url("http://fmasion.github.com/releases/"))(Resolver.ivyStylePatterns)

  play.Project.playScalaSettings


