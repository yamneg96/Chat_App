allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir: Directory = rootProject.layout.buildDirectory.dir("../../build").get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
/*
// Configure repositories for all projects
allprojects {
    repositories {
        google() // Include Google's Maven repository
        mavenCentral() // Include Maven Central repository
    }
}

// Create a new build directory two levels up from the root project
val newBuildDir: Directory = rootProject.layout.buildDirectory.dir("../../build").get()
// Set the root project's build directory to the new location
rootProject.layout.buildDirectory.value(newBuildDir)

// Configure build directories for subprojects
subprojects {
    // Create a build directory for each subproject within the new build directory
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    // Set the subproject's build directory to the new location
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}

// Make all subprojects depend on the evaluation of the ':app' project
subprojects {
    project.evaluationDependsOn(":app")
}

// Register a new task named "clean" to delete the build directory
tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
} */