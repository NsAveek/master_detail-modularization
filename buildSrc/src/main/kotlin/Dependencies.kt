import org.gradle.api.JavaVersion

object Config {
    val minSdk = 23
    val compileSdk = 31
    val targetSdk = 31
    val javaVersion = JavaVersion.VERSION_1_8
    val buildTools = "30.0.2"
}

object Versions {

    // <editor-fold desc="google">
    val androidx_core = "1.7.0"
    val androidx_recyclerview = "1.2.1"
    val androidx_navigation = "2.3.5"
    val androidx_constraintLayout = "2.1.2"
    val material = "1.4.0"
    val appCompat = "1.4.0"


    val kotlin_compiler_extension_version = "1.0.0"
    val nav_version = "2.4.0-alpha03"
    val hilt_version = "2.40"
    val paging_version = "3.0.0"
    val paging_compose_version = "1.0.0-alpha14"
    val retrofit_version = "2.9.0"
    val okhttpLoggingInterceptor_version = "4.9.0"
    val coroutines_version = "1.4.3"


    val lifecycle_version = "2.3.1"
    val room_version = "2.3.0"
    val glide_version = "4.12.0"

    val compose_version = "1.0.5"

    // </editor-fold>

    // <editor-fold desc="testing">
    val junit = "4.12"
    val androidx_espresso = "3.4.0"
    val androidx_testing = "1.1.3"
    //</editor-fold>

    // <editor-fold desc="tools">
    val gradleandroid = "7.0.2"
//    val gradleandroid = "7.0.3"
    val kotlin = "1.5.20"
    val gradleversions = "0.36.0"
    // </editor-fold>

}

object Deps {

    // Gradle
    val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradleandroid}"
    val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val tools_gradleversions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleversions}"


    // Android - Core

    val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"
    val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
    val androidx_material = "com.google.android.material:material:${Versions.material}"
    val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    // navigation
    val androidx_navigation_safeargs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"
    val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation}"
    val androidx_navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation}"
    val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"

    // hilt
    val androidx_hilt_classpath = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt_version}"
    val androidx_hilt = "com.google.dagger:hilt-android:${Versions.hilt_version}"
    val androidx_hilt_kapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt_version}"

    // Compose


    val compose_ui = "androidx.compose.ui:ui:${Versions.compose_version}"
    val compose_ui_tooling =  "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
    val compose_foundation =  "androidx.compose.foundation:foundation:${Versions.compose_version}"
    val compose_material = "androidx.compose.material:material:${Versions.compose_version}"

    val compose_material_icons_core = "androidx.compose.material:material-icons-core:${Versions.compose_version}"
    val compose_material_icons_ext =  "androidx.compose.material:material-icons-extended:${Versions.compose_version}"

    val compose_activity_integration = "androidx.activity:activity-compose:1.3.1"
    val compose_viewmodel_integration =  "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"

    val compose_livedata = "androidx.compose.runtime:runtime-livedata:${Versions.compose_version}"
    val compose_runtime_rxjava = "androidx.compose.runtime:runtime-rxjava2:${Versions.compose_version}"

    val compose_test = "androidx.compose.ui:ui-test-junit4:${Versions.compose_version}"


    // Room
    val androidx_room_runtime = "androidx.room:room-runtime:${Versions.room_version}"
    val androidx_room_kapt = "androidx.room:room-compiler:${Versions.room_version}"
    val androidx_room_ktx = "androidx.room:room-ktx:${Versions.room_version}"

    // Paging
    val androidx_paging_runtime_ktx = "androidx.paging:paging-runtime-ktx:${Versions.paging_version}"
    // alternatively - without Android dependencies for tests
    val androidx_paging_common_test =  "androidx.paging:paging-common-ktx:${Versions.paging_version}"
    // optional - RxJava2 support
    val androidx_paging_rxjava2 =  "androidx.paging:paging-rxjava2-ktx:${Versions.paging_version}"
    // optional - RxJava3 support
    val androidx_paging_rxjava3 = "androidx.paging:paging-rxjava3:${Versions.paging_version}"
    // optional - Jetpack Compose integration
    val androidx_paging_compose =  "androidx.paging:paging-compose:${Versions.paging_compose_version}"


    // Retrofit
    val androidx_retrofit =  "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    val androidx_retrofit_gson_conv =  "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    val androidx_retrofit_mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit_version}"
    val androidx_retrofit_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit_version}"
    val androidx_okhttp_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLoggingInterceptor_version}"

    // Glide
    val glide_version = "com.github.bumptech.glide:glide:${Versions.glide_version}"
    val glide_kapt = "com.github.bumptech.glide:compiler:${Versions.glide_version}"

    // Junit
    val testlib_junit = "junit:junit:${Versions.junit}"
    val test_junit_ext = "androidx.test.ext:junit:${Versions.androidx_testing}"
    // Espresso
    val testandroidx_rules = "androidx.test:rules:${Versions.androidx_testing}"
    val testandroidx_runner = "androidx.test:runner:${Versions.androidx_testing}"
    val testandroidx_espressocore = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"



}