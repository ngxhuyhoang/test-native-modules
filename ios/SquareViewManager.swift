import React
import SwiftUI

@objc(SquareViewManager)
class SquareViewManager: RCTViewManager {
  
  override func view() -> UIView! {
    let hostingController = UIHostingController(rootView: SquareView())
    return hostingController.view
  }
  
  override static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
