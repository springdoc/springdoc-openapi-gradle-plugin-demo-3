# springdoc-openapi-gradle-plugin-demo-3

Demo of the [springdoc-openapi Gradle plugin](https://github.com/springdoc/springdoc-openapi-gradle-plugin) with
Spring Boot 4.

| Spring Boot | springdoc-openapi | Gradle | Java | Build script | Port | Output |
|---|---|---|---|---|---|---|
| 4.1 | 3.2 | 9.8 (wrapper) | 17 | Kotlin DSL | 8083 | `build/openapi.json` |

```shell
./gradlew generateOpenApiDocs
```

The plugin starts the application, downloads `http://localhost:8083/v3/api-docs` to `build/openapi.json`, and stops
the application.

`settings.gradle.kts` lists `mavenLocal()` first, so a version of the plugin published locally with
`./gradlew publishToMavenLocal` (in the plugin repository) is used before the released one.
