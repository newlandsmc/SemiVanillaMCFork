pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "SemiVanillaMC"

include("SemiVanilla-api", "SemiVanilla-server")
