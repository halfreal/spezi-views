Spezi Views
===========

Most Wanted and Missing Views Collection for Android



Progress Button
---------------

A Button which is holding a Progressbar, for a nice way to indicate asynchronous network actions.
Define it in your layout:

```xml
<de.halfreal.spezi.views.ProgressButton
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Press me"
        app:selectedText="I am loaded"
        app:unselectedText="Press me again"
        app:loadingDrawable="@drawable/spinner"
        />
```

and enable / disable progress animation:

```java
...
//show a rotation spinner, and no text (or the loading text)
progressButton.enableLoadingState();

//show no animation, but the selected/ unselected text
progressButton.disableLoadingState();
...
```

Download
--------

Download the latest JAR or grab via Maven:

```xml
<dependency>
  <groupId>de.halfreal</groupId>
  <artifactId>spezi-views</artifactId>
  <type>apklib</type>
  <version>(insert latest version)</version>
</dependency>
```

License
-------

    Copyright 2013 Halfreal Games

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
      
