# SemiVanillaMCFork - A Paper fork, using paperweight

This is an example project, showcasing how to setup a fork of Paper (or any other fork using paperweight), using paperweight.

The files of most interest are
- build.gradle.kts
- settings.gradle.kts
- gradle.properties

## Tasks

```
Paperweight tasks
-----------------
applyApiPatches
applyPatches
applyServerPatches
cleanCache - Delete the project setup cache and task outputs.
generateDevelopmentBundle
paperclipJar - Build a runnable paperclip jar
rebuildApiPatches
rebuildPatches
rebuildServerPatches
reobfJar - Re-obfuscate the built jar to obf mappings
runDev - Spin up a non-shaded non-remapped test server
runReobf - Spin up a test server from the reobfJar output jar
runShadow - Spin up a test server from the shadowJar archiveFile
```
