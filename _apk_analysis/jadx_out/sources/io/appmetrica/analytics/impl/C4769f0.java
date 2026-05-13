package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4769f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f66719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f66720b = Looper.getMainLooper().getThread();

    public C4769f0(InterfaceC4795g0 interfaceC4795g0, Map map) {
        this.f66719a = map;
    }
}
