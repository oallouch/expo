const path = require('path');

function getArtifactsPath() {
  if (process.env.GITHUB_WORKSPACE) {
    return path.join(process.env.GITHUB_WORKSPACE, 'packages', 'expo-dev-client', 'artifacts');
  }

  return './artifacts';
}

const artifactsPath = getArtifactsPath();

module.exports = {
  'test-runner': 'jest',
  runnerConfig: 'e2e/config.json',
  skipLegacyWorkersInjection: true,
  devices: {
    emulator: {
      type: 'android.emulator',
      device: {
        avdName: 'DevClientEmulator',
      },
    },
    simulator: {
      type: 'ios.simulator',
      device: {
        type: 'iPhone 8',
      },
    },
  },
  apps: {
    'android.debug': {
      type: 'android.apk',
      binaryPath: 'android/app/build/outputs/apk/debug/app-debug.apk',
      build:
        'cd android && ./gradlew assembleDebug assembleAndroidTest -DtestBuildType=debug && cd ..',
    },
    'ios.debug': {
      type: 'ios.app',
      binaryPath: 'ios/build/Build/Products/Debug-iphonesimulator/dev-client-e2e.app',
      build:
        'xcodebuild -workspace ios/dev-client-e2e.xcworkspace -scheme dev-client-e2e -configuration Debug -sdk iphonesimulator -arch x86_64 -derivedDataPath ios/build',
    },
  },
  configurations: {
    android: {
      device: 'emulator',
      app: 'android.debug',
    },
    ios: {
      device: 'simulator',
      app: 'ios.debug',
    },
  },
  artifacts: {
    rootDir: artifactsPath,
    plugins: {
      uiHierarchy: { enabled: true, keepOnlyFailedTestsArtifacts: true },
      log: { enabled: true, keepOnlyFailedTestsArtifacts: true },
      screenshot: {
        enabled: true,
        keepOnlyFailedTestsArtifacts: true,
      },
    },
  },
};
