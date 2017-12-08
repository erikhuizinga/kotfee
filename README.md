# kotfee :coffee:

[Google's Dagger 2.13 coffee maker example](https://github.com/google/dagger/tree/dagger-2.13/examples/simple) in Kotlin.

# How-to

## Run in IDE

Make sure you run Gradle task `kaptKotlin` before running directly from your IDE (e.g. IntelliJ IDEA). This task runs Kotlin's annotation processor and generates stubs that otherwise may not be found by your IDE, resulting in an error.

## Run from command line

```bash
./gradlew jar # Also runs kaptKotlin before putting it all into a jar
java -jar build/libs/kotfee.jar
```
