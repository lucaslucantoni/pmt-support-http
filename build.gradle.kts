plugins {
    java
    id("org.springframework.boot") version "3.5.3"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "br.com"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {

    // Dependencies
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.mapstruct:mapstruct:1.6.3")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.springframework.data:spring-data-jpa:3.5.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.5.3")
    implementation("com.microsoft.sqlserver:mssql-jdbc:12.4.2.jre11")
    implementation("com.azure:azure-messaging-eventhubs:5.20.2")
    implementation("com.azure:azure-identity:1.16.2")

    // Test Dependencies
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Annotation & Compile and Development  Processors
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.6.0.Final")
    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.6.3")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
