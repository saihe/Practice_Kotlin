plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "saihe.practice"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("saihe.practice.kotlin.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(19)
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest {
        attributes["Main-Class"] = "saihe.practice.kotlin.ApplicationKt"
    }
    configurations["runtimeClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
}
