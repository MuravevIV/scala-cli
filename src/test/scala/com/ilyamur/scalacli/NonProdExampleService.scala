package com.ilyamur.scalacli

import org.slf4j.{Logger, LoggerFactory}

class NonProdExampleService extends ExampleService {

  private val LOG: Logger = LoggerFactory.getLogger(getClass)

  var printed: Boolean = false

  override def printParameters(input: String, output: String): Unit = {
    printed = true
    LOG.info(s"NonProdExampleService::printParameters('$input', '$output')")
  }
}
