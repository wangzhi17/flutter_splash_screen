#import "FlutterSplashScreenPlugin.h"

@implementation FlutterSplashScreenPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  FlutterMethodChannel* channel = [FlutterMethodChannel
      methodChannelWithName:@"flutter_splash_screen"
            binaryMessenger:[registrar messenger]];
  FlutterSplashScreenPlugin* instance = [FlutterSplashScreenPlugin new];
  [registrar addMethodCallDelegate:instance channel:channel];
}

- (void)handleMethodCall:(FlutterMethodCall*)call result:(FlutterResult)result {
  if ([@"show" isEqualToString:call.method]) {

  } else if ([@"hide" isEqualToString:call.method]) {

  } else {
    result(FlutterMethodNotImplemented);
  }
}

@end
