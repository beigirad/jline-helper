plugins {
    kotlin("jvm") version "2.1.0"
    `maven-publish`
}

repositories {
    mavenCentral()
}

group = "ir.beigirad"
version = "1.0-SNAPSHOT"

dependencies {
    api("org.jline:jline:3.23.0")
}

kotlin {
    jvmToolchain(11)
}

publishing {
    publications {
        create<MavenPublication>("console-helper"){
            from(project.components["kotlin"])
            groupId = group.toString()
            artifactId = "console-helper"
            version = version.toString()
            pom {
                name.set("console-helper")
                description.set("A helper library to work with console in kotlin-script ")
                url.set("https://github.com/beigirad/console-helper")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://github.com/beigirad/console-helper/blob/main/LICENSE")
                    }
                }
                scm {
                    url.set("https://github.com/beigirad/console-helper")
                }
                developers {
                    developer {
                        name.set("Farhad Beigirad")
                        url.set("https://github.com/beigirad")
                    }
                }
            }
        }
    }
}