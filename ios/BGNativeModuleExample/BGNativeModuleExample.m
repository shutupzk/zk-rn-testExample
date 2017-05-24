//
//  BGNativeModuleExample.m
//  BGNativeModuleExample
//
//  Created by zhakang on 2017/5/24.
//  Copyright © 2017年 zhakang. All rights reserved.
//

#import "BGNativeModuleExample.h"

@implementation BGNativeModuleExample

RCT_EXPORT_MODULE();

RCT_REMAP_METHOD(testPrint,
                 name:(NSString *)name
                 resolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    resolve(name);
}

@end
