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
  
  /**
   phương thức requiresMainQueueSetup() được dùng để xác định xem Native Module của bạn có cần được khởi tạo trên main thread (main queue) hay không. Nếu phương thức này trả về true, Native Module sẽ được khởi tạo trên main thread, ngược lại nếu trả về false, nó sẽ được khởi tạo trên background thread.
   */
  @objc(requiresMainQueueSetup)
  static func requiresMainQueueSetup() -> Bool {
    return false
  }
  
  @objc(increase:)
  func increase(_ callback: RCTResponseSenderBlock) {
    counter += 1
    callback([counter])
  }
  
  
  @objc(increaseAsync:reject:)
  func increaseAsync(_ resolve: RCTPromiseResolveBlock, reject: RCTPromiseRejectBlock) {
    counter += 1
    resolve(counter)
  }
  
  @objc(decrease:)
  func decrease(_ callback: RCTResponseSenderBlock) {
    counter -= 1
    callback([counter])
  }
  
  @objc(decreaseAsync:reject:)
  func decreaseAsync(_ resolve: RCTPromiseResolveBlock, reject: RCTPromiseRejectBlock) {
    counter -= 1
    resolve(counter)
  }
}
