export ANDROID_HOME=/Users/somkiat/Library/Android/sdk
export PATH=.:$ANDROID_HOME/platform-tools/:$PATH
./gradlew assembleDebug assembleAndroidTest
fastlane ui
rm fastlane/metadata/android/th/images/phoneScreenshots/*
cp fastlane/screengrab/*/images/*/*.png fastlane/metadata/android/th/images/phoneScreenshots/
