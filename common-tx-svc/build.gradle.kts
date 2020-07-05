plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.springframework.cloud:spring-cloud-starter-zipkin:2.2.0.RELEASE")
    implementation("org.springframework.cloud:spring-cloud-starter-sleuth:2.2.0.RELEASE")
    implementation ("org.mockito:mockito-core:3.3.3")
    testCompile ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testCompile ("org.jetbrains.kotlin:kotlin-test")
    testCompile ("org.jetbrains.kotlin:kotlin-test-junit")
}