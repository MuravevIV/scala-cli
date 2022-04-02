package com.ilyamur.scalacli

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class ApplicationRunnerIT {

  object env extends ApplicationModule {

    import com.softwaremill.macwire.*

    override lazy val exampleService: NonProdExampleService = wire[NonProdExampleService]
  }

  @Test
  def testRun(): Unit = {

    env.applicationRunner.run("a", "b")

    val nonProdExampleService = env.exampleService
    assertThat(nonProdExampleService.printed).isTrue
  }
}
