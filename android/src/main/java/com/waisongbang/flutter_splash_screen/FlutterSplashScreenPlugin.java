package com.waisongbang.flutter_splash_screen;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

/**
 * SplashScreen
 * 启动屏
 */
public class FlutterSplashScreenPlugin implements FlutterPlugin, MethodCallHandler {

  private MethodChannel channel;


  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding binding) {
    channel = new MethodChannel(binding.getBinaryMessenger(), "flutter_splash_screen");
    channel.setMethodCallHandler(this);
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    channel.setMethodCallHandler(null);
  }

  @Override
  public void onMethodCall(MethodCall methodCall, Result result) {
    switch (methodCall.method) {
      case "hide":
        hide();
        break;
      default:
        result.notImplemented();
    }
  }


  /**
   * 关闭启动屏
   */
  private void hide() {
    SplashScreen.hide();
  }
}
