package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes7.dex */
public final class Jg implements Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f65443a;

    public Jg(@NonNull Bm bm2) {
        this.f65443a = bm2;
    }

    @Override // io.appmetrica.analytics.impl.Ll
    public final void a() {
        NetworkTask networkTaskC = this.f65443a.c();
        if (networkTaskC != null) {
            C5009oa.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }
}
