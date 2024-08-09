#import <Foundation/Foundation.h>

#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(CounterModule, NSObject)

RCT_EXTERN_METHOD(increase: (RCTResponseSenderBlock) callback)
RCT_EXTERN_METHOD(decrease: (RCTResponseSenderBlock) callback)

@end
