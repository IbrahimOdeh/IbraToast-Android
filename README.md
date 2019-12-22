# IbraToast-Android

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.IbrahimOdeh:ibraToast:1.1'
}
```

## Screenshots
<img src="https://github.com/IbrahimOdeh/IbraToast/blob/master/IbraToastImgs.jpg">


## Usage

1-  display a Success Toast:

``` java
IbraToast.makeText(this, "Success !", Toast.LENGTH_SHORT, 1).show();
```

2-  display an Error Toast:

``` java
IbraToast.makeText(this, "Error !", Toast.LENGTH_SHORT, 2).show();
```

3-  display an Info Toast:

``` java
IbraToast.makeText(this, "Info", Toast.LENGTH_SHORT, 3).show();
```

4-  display a Dark Toast:

``` java
IbraToast.makeText(this, "Dark", Toast.LENGTH_SHORT, 4).show();
```

## License

```
Copyright (c) 2019 Ibrahim Odeh

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

