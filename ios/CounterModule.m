#import <Foundation/Foundation.h>

#import <React/RCTBridgeModule.h>

@interface

RCT_EXTERN_MODULE(CounterModule, NSObject)

RCT_EXTERN_METHOD(increase: (RCTResponseSenderBlock) callback)
RCT_EXTERN_METHOD(increaseAsync: (RCTPromiseResolveBlock) resolve reject:(RCTPromiseRejectBlock) reject)
RCT_EXTERN_METHOD(decrease: (RCTResponseSenderBlock) callback)
RCT_EXTERN_METHOD(decreaseAsync: (RCTPromiseResolveBlock) resolve reject:(RCTPromiseRejectBlock) reject)

@end
