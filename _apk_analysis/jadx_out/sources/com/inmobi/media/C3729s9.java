package com.inmobi.media;

import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3729s9 {
    public static C3779u9 a(Interceptor[] interceptorArr, Dispatcher dispatcher, Interceptor[] interceptorArr2, C3666pk c3666pk, int i10) {
        if ((i10 & 1) != 0) {
            interceptorArr = new Interceptor[0];
        }
        if ((i10 & 2) != 0) {
            dispatcher = A9.f25146b;
        }
        if ((i10 & 4) != 0) {
            interceptorArr2 = new Interceptor[0];
        }
        if ((i10 & 8) != 0) {
            c3666pk = new C3666pk(60L, 60L, 60L);
        }
        tn.p.k(interceptorArr, "interceptors");
        tn.p.k(dispatcher, "dispatcher");
        tn.p.k(interceptorArr2, "networkInterceptors");
        tn.p.k(c3666pk, "timeoutConfig");
        return new C3779u9(interceptorArr, interceptorArr2, dispatcher, c3666pk);
    }
}
