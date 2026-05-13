package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* JADX INFO: loaded from: classes5.dex */
public final class Ol implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f65721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pl f65722b;

    public Ol(Pl pl2, StartupParamsCallback startupParamsCallback) {
        this.f65722b = pl2;
        this.f65721a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.B6
    public final void a(int i10, Bundle bundle) {
        this.f65722b.b(bundle, this.f65721a);
    }
}
