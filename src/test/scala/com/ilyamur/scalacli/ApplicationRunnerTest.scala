package com.ilyamur.scalacli

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(Array(classOf[MockitoExtension]))
class ApplicationRunnerTest {

  @Mock
  var mockExampleService: ExampleService = _

  @Test
  def testRun(): Unit = {
    val applicationRunner = ApplicationRunner(mockExampleService)
    applicationRunner.run("a", "b")

    verify(mockExampleService).printParameters("a", "b")
  }
}
