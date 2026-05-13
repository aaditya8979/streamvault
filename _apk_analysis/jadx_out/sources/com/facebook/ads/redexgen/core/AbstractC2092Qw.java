package com.facebook.ads.redexgen.core;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2092Qw {
    public static <T> T A00(T t10, Class<T> cls) {
        ClassLoader classLoader = t10.getClass().getClassLoader();
        return cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, new C2091Qv(t10, classLoader)));
    }
}
