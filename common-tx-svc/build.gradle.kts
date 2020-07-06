plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.springframework.cloud:spring-cloud-sleuth-zipkin:2.1.4.RELEASE")
    implementation("org.springframework.cloud:spring-cloud-starter-zipkin:2.1.4.RELEASE")
    implementation ("org.mockito:mockito-core:3.3.3")

    testCompile ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testCompile ("org.jetbrains.kotlin:kotlin-test")
    testCompile ("org.jetbrains.kotlin:kotlin-test-junit")
}