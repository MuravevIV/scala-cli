package com.ilyamur.scalacli

import org.slf4j.{Logger, LoggerFactory}

class ExampleService {

  val LOG: Logger = LoggerFactory.getLogger(getClass)

  def run(input: String, output: String): Unit = {
    LOG.info(s"Application::run('${input}', '${output}')")
  }
}
