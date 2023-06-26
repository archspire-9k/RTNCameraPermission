package com.rtncamerax;

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

import java.util.Collections;

class CameraXPackage : TurboReactPackage() {
  override fun getModule(name: String?, reactContext: ReactApplicationContext): NativeModule? = 
     if (name == CameraXModule.NAME) {
    CameraXModule(reactContext)
   } else {
 null
   }

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
    mapOf(
    CameraXModule.NAME to ReactModuleInfo(
      CameraXModule.NAME,
      CameraXModule.NAME,
      false, // canOverrideExistingModule
      false, // needsEagerInit
      true, // hasConstants
      false, // isCxxModule
      true // isTurboModule     )
   )
    )
  }
}