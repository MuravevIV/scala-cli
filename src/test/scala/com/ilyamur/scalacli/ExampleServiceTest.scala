package com.ilyamur.scalacli

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleServiceTest {

  @Test
  def test(): Unit = {
    val exampleService = ExampleService()
    exampleService.run("a", "b")
    assertThat(1 + 1).isEqualTo(2)
  }
}
