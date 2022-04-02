package com.ilyamur.scalacli

import org.slf4j.{Logger, LoggerFactory}

class ApplicationRunner(exampleService: ExampleService) {

  def run(input: String, output: String): Unit = {
    exampleService.printParameters(input, output)
  }
}
