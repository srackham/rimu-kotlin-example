# Rimu Kotlin Example Application
A minimal application using the [Rimu Kotlin library](https://github.com/srackham/rimu-kt).

## Install, Build, Test and Run
Prerequisites: The Java SDK and the Kotlin compiler (or just open the project in [IntelliJ IDEA](https://www.jetbrains.com/idea/)).

1. Install the project from Github:

        git clone https://github.com/srackham/rimu-kotlin-example.git

2. Build and test:

        cd rimu-kotlin-example
        ./gradlew test

3. Build the executable:

        ./gradlew installDist

4. Run the app:

        ./build/install/rimu-kotlin-example/bin/rimu-kotlin-example

It should print: `<p>Hello <em>Rimu</em>!</p>`