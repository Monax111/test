plugins {
    id("com.gorylenko.gradle-git-properties") version "1.5.2"
    kotlin("jvm") version "1.3.60"
}

repositories{
    jcenter()
}

id("org.springframework.boot") version "2.3.1.RELEASE"

class Version(val name:String){
    lateinit var version:String
}

fun id(name: String):Version{
    println(name)
    return Version(name)
}

infix fun Version.version(version :String) { this.version = version}
