plugins {
    java
}

group = "syw"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("ch.qos.logback", "logback-core", "1.2.3")
    compile("org.slf4j", "slf4j-api", "1.7.26")
    testCompile("ch.qos.logback", "logback-classic", "1.2.3")
    testCompile("org.junit.jupiter:junit-jupiter-api:5.4.0")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.4.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}