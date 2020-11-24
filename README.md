# Algorithm and Data Structures Library

![Build](https://github.com/Sho372/algds/workflows/Build/badge.svg)
![Publish](https://github.com/Sho372/algds/workflows/Publish/badge.svg)

Maven repo url: https://maven.pkg.github.com/Sho372/algds

|     Key    |       Value      |
|:----------:|:----------------:|
|   groupId  | com.sho372.algds |
| artifactId |    algds-libs    |

## How to use

1. Create a Gradle Project.
2. Authenticating to GitHub Packages.

    ```
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Sho372/algds")
            credentials {
                username = '<USERNAME>'
                password = '<TOKEN>'
            }
            metadataSources {
                mavenPom()
                artifact()
            }
        }
        mavenCentral()
    }
    ```

3. Add the package dependencies.

    ```
    dependencies {
        implementation 'com.sho372.algds:algds-libs:<VERSION>'
    }
    ```

4. Add the maven plugin.

    ```
    plugins {
        id 'maven'
    }
    ```

5. Install the package.

    ```
    $ gradle install
    ```