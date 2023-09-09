import 'dart:async';

import 'package:flutter/services.dart';

class SplashScreen {
  final methodChannel = const MethodChannel('flutter_splash_screen');

  ///hide splash screen
  Future<void> hide() async {
    await methodChannel.invokeMethod<String>('hide');
  }
}