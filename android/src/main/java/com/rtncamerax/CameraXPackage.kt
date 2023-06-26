package com.rtncamerax;

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

import java.util.Collections;
import java.util.List;

class CameraXPackage : TurboReactPackage() {
  override fun getModule(name: String?, reactContext: ReactApplicationContext): NativeModule? = null

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider? = null
}