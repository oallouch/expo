# Changelog

## Unpublished

### 🛠 Breaking changes

### 🎉 New features

### 🐛 Bug fixes

### 💡 Others

## 10.1.1 - 2022-02-01

### 🐛 Bug fixes

- Fix `Plugin with id 'maven' not found` build error from Android Gradle 7. ([#16080](https://github.com/expo/expo/pull/16080) by [@kudo](https://github.com/kudo))

## 10.1.0 — 2021-12-03

### 🎉 New features

- Removed lodash. ([#12523](https://github.com/expo/expo/pull/12523) by [@EvanBacon](https://github.com/EvanBacon))

### 💡 Others

- Update `lodash` dependency. ([#15069](https://github.com/expo/expo/pull/15069) by [@Simek](https://github.com/Simek))

## 10.0.1 — 2021-10-01

_This version does not introduce any user-facing changes._

## 10.0.0 — 2021-09-28

### 🛠 Breaking changes

- Dropped support for iOS 11.0 ([#14383](https://github.com/expo/expo/pull/14383) by [@cruzach](https://github.com/cruzach))

### 🐛 Bug fixes

- Fix building errors from use_frameworks! in Podfile. ([#14523](https://github.com/expo/expo/pull/14523) by [@kudo](https://github.com/kudo))

### 💡 Others

- Converted Android code to Kotlin ([#13724](https://github.com/expo/expo/pull/13724) by [@ixf](https://github.com/ixf))
- Added missing `_array` typing to `SQLResultSetRowList`/`ResultSet` return object. ([#13826](https://github.com/expo/expo/pull/13826) by [@bbarthec](https://github.com/bbarthec))

## 9.2.0 — 2021-06-16

### 🐛 Bug fixes

- Enable kotlin in all modules. ([#12716](https://github.com/expo/expo/pull/12716) by [@wschurman](https://github.com/wschurman))

### 💡 Others

- Migrated from `unimodules-file-system-interface` to `expo-modules-core`.
- Build Android code using Java 8 to fix Android instrumented test build error. ([#12939](https://github.com/expo/expo/pull/12939) by [@kudo](https://github.com/kudo))

## 9.1.0 — 2021-03-10

### 🎉 New features

- Updated Android build configuration to target Android 11 (added support for Android SDK 30). ([#11647](https://github.com/expo/expo/pull/11647) by [@bbarthec](https://github.com/bbarthec))

### 🐛 Bug fixes

- Remove peerDependencies and unimodulePeerDependencies from Expo modules. ([#11980](https://github.com/expo/expo/pull/11980) by [@brentvatne](https://github.com/brentvatne))

## 9.0.0 — 2021-01-15

### 🛠 Breaking changes

- Dropped support for iOS 10.0 ([#11344](https://github.com/expo/expo/pull/11344) by [@tsapeta](https://github.com/tsapeta))

## 8.5.0 — 2020-11-17

_This version does not introduce any user-facing changes._

## 8.4.0 — 2020-08-18

_This version does not introduce any user-facing changes._

## 8.3.0 — 2020-07-29

### 🐛 Bug fixes

- Fix incorrect `rowsAffected` value in result of `executeSql` method on iOS when deleting/updating cascadely. ([@9137](https://github.com/expo/expo/pull/9317) by [@mczernek](https://github.com/mczernek))

## 8.2.1 — 2020-05-29

### 🐛 Bug fixes

- Fixed support for using `expo-sqlite` on Web ([#8518](https://github.com/expo/expo/pull/8518) by [@sjchmiela](https://github.com/sjchmiela))

## 8.2.0 — 2020-05-27

_This version does not introduce any user-facing changes._
