plugins {
    id("java")
}

group = "io.github.asolntsev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.26.0")
    implementation("fr.opensagres.xdocreport:xdocreport:2.0.6")

    implementation("org.odftoolkit:odfdom-java:0.8.7") // why I need to add this dependency at all?

    implementation("fr.opensagres.xdocreport:fr.opensagres.poi.xwpf.converter.pdf.openpdf:2.0.6")


    // If you comment out this line, you will get another error:
    // java.lang.NoSuchFieldError: list
    implementation("com.github.librepdf:openpdf:2.0.2")
}

tasks.test {
    useJUnitPlatform()
}
