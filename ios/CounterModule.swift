//
//  CounterModule.swift
//  TestNativeModule
//
//  Created by Hoang Nguyen on 9/8/24.
//

import Foundation

@objc(CounterModule)
class CounterModule: NSObject {
  var counter = 0
  
  @objc(increase:)
  func increase(_ callback: RCTResponseSenderBlock) {
    counter += 1
    callback([counter])
  }
  
  @objc(decrease:)
  func decrease(_ callback: RCTResponseSenderBlock) {
    counter -= 1
    callback([counter])
  }
}
