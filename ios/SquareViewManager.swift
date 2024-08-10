import React
import SwiftUI

@objc(SquareViewManager)
class SquareViewManager: RCTViewManager {
  private var width: CGFloat = 100
  private var height: CGFloat = 100
  
  func view() -> SquareView! {
    return SquareView(width: width, height: height)
  }
  
  override static func requiresMainQueueSetup() -> Bool {
    return true
  }
  
  @objc func setWidth(_ node: NSNumber, width: CGFloat) {
    self.width = width
  }
  
  @objc func setHeight(_ node: NSNumber, height: CGFloat) {
    self.height = height
  }
}
