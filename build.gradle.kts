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
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}