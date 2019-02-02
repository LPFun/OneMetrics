# OneMetrics
[![](https://jitpack.io/v/LPFun/OneMetrics.svg)](https://jitpack.io/#LPFun/OneMetrics)

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.LPFun:OneMetrics:Tag'
	}
  
Step 3. Add manifest Placeholders

        manifestPlaceholders = [
                onesignal_app_id: 'PUT YOUR ONESIGNAL APP ID HERE',
                onesignal_google_project_number: 'REMOTE'
        ]

Step 4. Init OneMitrics in Application class

	OneMetrics.init(this, "App Metrics Key")
