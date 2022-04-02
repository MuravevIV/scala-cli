package com.ilyamur.scalacli

import org.slf4j.{Logger, LoggerFactory}

class ExampleService {

  private val LOG: Logger = LoggerFactory.getLogger(getClass)

  def printParameters(input: String, output: String): Unit = {
    LOG.info(s"ExampleService::run('${input}', '${output}')")
  }
}
