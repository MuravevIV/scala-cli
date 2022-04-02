# Scala CLI example

Baseline CLI Scala 3 application

- Language - [Scala 3](https://docs.scala-lang.org) (as Maven dependency + plugin)
- CLI - [PicoCLI](https://picocli.info)
- DI Framework - [MacWire](https://github.com/softwaremill/macwire)
- Unit tests with [Junit 5](https://junit.org/junit5/docs/current/user-guide/) and [Mocito](https://site.mockito.org/) - regular and "IT" tests

## Prerequisites

- Java: [openjdk version "11"](https://adoptopenjdk.net/) (or similar)
- Maven: [Apache Maven 3.8.3](https://maven.apache.org/) (or similar)

## Build

```
mvn clean install
```

## CLI Help page 

```
java -jar target/scala-cli-1.0.0-SNAPSHOT.jar --help
```

```
Usage: <main class> [-hV] -i=<input> -o=<output>
  -h, --help              Show this help message and exit.
  -i, --input=<input>     Input directory
  -o, --output=<output>   Output directory
  -V, --version           Print version information and exit.
```

## Execution example

```
java -jar target/scala-cli-1.0.0-SNAPSHOT.jar --input=i --output=o
```

```
00:00:00.000 [main] INFO com.ilyamur.scalacli.ExampleService - ExampleService::run('i', 'o')
```

## IT tests example

__Note:__ Tests ending with "IT" (case-sensitive) are not executed during Maven's regular test phase.
To run "IT" tests - specific profile (`it-tests`) should be active.

See: [ApplicationRunnerIT](src/test/scala/com/ilyamur/scalacli/ApplicationRunnerIT.scala)

### Running IT tests

```
mvn test -P it-tests
```
