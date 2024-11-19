# Preprocessor Example Mod

Example mod for ReplayMod's [preprocessor](https://github.com/ReplayMod/preprocessor).

## Setup

For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.

After setting up the workspace, you can follow the instructions below to get the preprocessor working.

- The version defined in `versions/mainProject` is used to compile the mod, other versions are using the preprocessor.
- To add a new version, add a new folder in `versions` and link the version in:
    - `settings.gradle` to the versions array so Gradle recognizes the version
    - `root.gradle.kts` to link the version to the preprocessor
- Every folder in `versions` should contain a `gradle.properties` file with the default properties for the version

For usage instructions please see the [ReplayMod preprocessor](https://github.com/ReplayMod/preprocessor) repository.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
