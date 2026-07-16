This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop (JVM).

* [/iosApp](./iosApp/iosApp) contains an iOS application. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* [/shared](./shared/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - [commonMain](./shared/src/commonMain/kotlin) is for code that’s common for all targets.
    - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
      For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
      the [iosMain](./shared/src/iosMain/kotlin) folder would be the right place for such calls.
      Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./shared/src/jvmMain/kotlin)
      folder is the appropriate location.

### Running the apps

Use the run configurations provided by the run widget in your IDE's toolbar. You can also use these commands and
options:

- Android app: `./gradlew :androidApp:assembleDebug`
- Desktop app:
    - Hot reload: `./gradlew :desktopApp:hotRun --auto`
    - Standard run: `./gradlew :desktopApp:run`
- Web app:
    - Wasm target (faster, modern browsers): `./gradlew :webApp:wasmJsBrowserDevelopmentRun`
    - JS target (slower, supports older browsers): `./gradlew :webApp:jsBrowserDevelopmentRun`
- iOS app: open the [/iosApp](./iosApp) directory in Xcode and run it from there.

---

### Steps to create a new Compose Multiplatform project

1. Create a new project in IntelliJ IDEA or Android Studio.
2. Montrer les composants Multiplatform dans le projet et les spécificités
   - Composable
   - Preview
   - actual expect
3. Les ressources string (i18n), font, images, theme 
4. Navigation et ecran de base
 - Scafold https://developer.android.com/develop/ui/compose/components/scaffold?hl=fr
 - ajout dependance `compose-navigation = { module = "org.jetbrains.androidx.navigation:navigation-compose", version.ref = "composeNavigation" }`
 - mofif gradle pour ajouter navigation dans le projet
5. Design system
6. Injection de dépendances (Koin) https://insert-koin.io/docs/reference/koin-core/kmp-setup/
7. ViewModel  
8. API rest (Ktor) https://ktor.io/docs/client-create-multiplatform-application.html
9. Persistence (preference, sqlite, datastore) natif (preference), Room (sqlite), DataStore (proto)
