package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface BlockingRpcChannel {
    Message callBlockingMethod(Descriptors.MethodDescriptor methodDescriptor, RpcController rpcController, Message message, Message message2) throws ServiceException;
}
