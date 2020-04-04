var dl4j_version = "1.0.0-beta6"
var slf4j_version = "1.7.25"

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.70"
    maven
    application
}

repositories {
    maven(url="https://nexus.ultimaengineering.io/repository/maven-public/")
}

dependencies {
    implementation("org.slf4j:slf4j-simple:${slf4j_version}")
    implementation( "org.slf4j:slf4j-api:${slf4j_version}")
    implementation("org.deeplearning4j:deeplearning4j-core:${dl4j_version}")
    implementation("org.deeplearning4j:deeplearning4j-zoo:${dl4j_version}")


    implementation("org.nd4j:nd4j-native-platform:${dl4j_version}")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application.
    mainClassName = "omega.text.spotter.AppKt"
}
