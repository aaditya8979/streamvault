package com.inmobi.media;

import com.vungle.ads.internal.ui.AdActivity;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3779u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3849x4 f28245a;

    public C3779u9(Interceptor[] interceptorArr, Interceptor[] interceptorArr2, Dispatcher dispatcher, C3666pk c3666pk) {
        tn.p.k(interceptorArr, "interceptors");
        tn.p.k(interceptorArr2, "networkInterceptors");
        tn.p.k(dispatcher, "dispatcher");
        tn.p.k(c3666pk, "timeoutConfig");
        this.f28245a = new C3849x4(interceptorArr, interceptorArr2, dispatcher, c3666pk);
    }

    public final p000do.p0 a(Me me2) {
        tn.p.k(me2, AdActivity.REQUEST_KEY_EXTRA);
        return p000do.i.b(A9.f25147c, null, null, new C3754t9(this, me2, null), 3, null);
    }
}
