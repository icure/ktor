kotlin {
    createCInterop("mutex", posixTargets()) {
        defFile = File(projectDir, "posix/interop/mutex.def")
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }

        commonTest {
            dependencies {
                api(project(":ktor-test-dispatcher"))
            }
        }
    }
}
