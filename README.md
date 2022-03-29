# Scala CLI example

Baseline CLI Scala 3 application

- Scala 3
- CLI - PicoCLI library with built-in help page
- Unit tests separation - regular and "IT" tests

## Prerequisites

- Java: openjdk version "11" (or similar)
- Maven: Apache Maven 3.8.3 (or similar)

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
00:00:00.000 [main] INFO com.ilyamur.scalacli.ExampleService - Application::run('i', 'o')
```

## IT tests example

__Note:__ Tests ending with "IT" (case-sensitive) are not executed during Maven's regular test phase.
To run "IT" tests - specific profile (`it-tests`) should be active.

See: [ExampleServiceIT](src/test/scala/com/ilyamur/scalacli/ExampleServiceIT.scala)

### Running large tests

```
mvn test -P it-tests
```
