package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes12.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
