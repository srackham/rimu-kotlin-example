import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application
}

version = "0.1.0"
description = "Minimal example Rimu Markup application."

repositories {
    mavenCentral()
    maven("https://jitpack.io") // SJR
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.srackham:rimu-kt:11.1.5")    // SJR
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}