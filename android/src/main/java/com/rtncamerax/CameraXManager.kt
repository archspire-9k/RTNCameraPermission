package com.rtncamerax

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.rtncalculator.NativeCalculatorSpec

class CameraXModule(reactContext: ReactApplicationContext) : NativeCalculatorSpec(reactContext) {

  override fun getName() = NAME

  companion object {
    const val NAME = "RTNCameraX"
  }
}