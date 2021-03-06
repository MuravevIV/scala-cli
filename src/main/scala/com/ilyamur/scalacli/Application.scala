package com.ilyamur.scalacli

import picocli.CommandLine
import picocli.CommandLine.{Command, Option}

object Application {

  def main(args: Array[String]): Unit = {
    val application = Application()
    new CommandLine(application).execute(args: _*);
  }
}

@Command(version = Array("1.0.0-SNAPSHOT"), mixinStandardHelpOptions = true)
class Application extends Runnable {

  @Option(names = Array("-i", "--input"), required = true, description = Array("Input directory"))
  private var input: String = _

  @Option(names = Array("-o", "--output"), required = true, description = Array("Output directory"))
  private var output: String = _

  object env extends ApplicationModule

  override def run(): Unit = {
    env.applicationRunner.run(input, output)
  }
}
