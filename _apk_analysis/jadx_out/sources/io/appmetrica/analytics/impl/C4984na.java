package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4984na implements InterfaceC4969mk {
    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
