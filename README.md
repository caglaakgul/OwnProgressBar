# OwnProgressBar

Step 1. Add the JitPack repository to your build file 

(You should make sure to add in settings.gradle file.)

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.caglaakgul:OwnProgressBar:1.0.0'
	}
