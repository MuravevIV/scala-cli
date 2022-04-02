package com.ilyamur.scalacli

import java.nio.file.{FileSystem, FileSystems}

trait ApplicationModule {

  import com.softwaremill.macwire.*

  lazy val exampleService: ExampleService = wire[ExampleService]
  lazy val applicationRunner: ApplicationRunner = wire[ApplicationRunner]
}
