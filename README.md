# Kotlin WASM example

An example of using Kotlin natively in the browser through WASM.

## How to

### Build the project

```bash
./gradlew build

```

## Run the app

```bash
./gradlew wasmBrowserRun -t

```

### Upgrade Gradle (example version)

```bash
./gradlew wrapper --gradle-version 8.2.1 --distribution-type all

```

### Update all dependencies if latest versions exist, and remove unused ones (it will update `gradle/libs.versions.toml`)

```bash
./gradlew versionCatalogUpdate

```

## Reference pages

- [Intro to Kotlin WASM projects in Intellij](https://kotlinlang.org/docs/wasm-get-started.html#create-a-new-kotlin-wasm-project)
- [Various examples for Kotlin and WASM](https://github.com/Kotlin/kotlin-wasm-examples/tree/main)