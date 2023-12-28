<b> Greetings from SherGillProductions </b> 


How To get a Git project into your build:
 //Gradle

Step 1. Add the JitPack repository to your build file


Add it in your root build.gradle at the end of repositories:

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
 
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Satwinder777:SherGillGram:Tag'
	}

 Step 3. Add the Version code

 version_code =  1.0.0

 
 
