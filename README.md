99x-training
============



To clone this repo, install git and:

`mkdir /your/path/99x-training`

`git clone git@github.com:jahufar/99x-training.git`

If you're on Windows, you may use  [msysGit](http://msysgit.github.com/) to do the equivalent via the GUI.



Syllabus
========


 
**Knowing your basics**

- Downloading the SDKs, setting up the development environment and tools
- Overview of the Android systems architecture
- Application life-cycle
- The Android Version and API Levels
- Building blocks: Activities, Intents, Services, Broadcast Receivers, Content Providers
- Android permission models
- Setting up your first Virtual Device.

**Hello Android!**

- Writing your first application and launching it on a Virtual Device
- Setting up your phone/tablet for debugging
- The anatomy of an Android application
- UI components overview
- Overview of the Android Manifest file
- Logging and debugging
- Working with multiple device form factors and screen densities
- An introduction to the resource loading framework
- Introduction to 9-patch image resources
- Internationalization and string resources
- Life-cycle methods and handling configuration changes
- Introducing the Dalvik Debug Monitor Server (DDMS)

**A closer look at Activities and Intents**

- Types of activities
- Passing parameters via Intents
- Interacting with other activities on the system.

**ListViews and Adapters**
 
- ArrayAdapter and BaseAdapters
- Designing Custom Listviews
- Dealing with performance issues

**Working with BroadcastReceivers**

- Introduction
- Registering to be notified: via manifest and via code
 
**Services**

- Introduction to Service base class, life-cycle methods
- Background and Foreground services
- Avoiding the "forever service" anti-pattern: Introduction to AlarmService

**Threading**

- An introduction to Android’s threading model
- Application Not Responding (ANR) or: Why you never ever block the UI thread
- Handlers and AsyncTask
- Threading and device configuration changes

**Network Services**

- Introducing the Apache HttpClient libraries
- Parsing JSON

**Power Management**

- Android's power management model
- Staying awake: Introduction to WakeLocks
- Types of wake locks, acquiring and releasing them.

**Working with databases**

- Introduction to persistent storage: Working with SQLite.
- SqliteHelpers
- Working with Cursors
- Binding cursors to Listviews via CursorAdapter

**Shared Preferences**

- Introduction to Android's shared preference framework
- Building preference UIs and working with PrefereceActivity
 
**Taking to Sensors**

- Classes of supported sensors
- Introduction to the SensorManager service
- Dealing with performance issues
- Talking to the Accelerometer, Gyroscope, Ambient Light and Proximity sensors

**Geolocation and GeoCoding**

- Location sensors: GPS, Cell Triangulation and Wi-Fi Triangulation
- Introduction to LocationManager services
- Dealing with performance issues
- Figuring out where you are: Geolocation and GeoCoding


**Packaging and distributing your application**

- Generating signing keys and signing your application
- Setting up 1-click build using Apache Ant
- Publishing to Google Play (The App Store Formerly Known As Google Market)
- Alternatives to Google Play





