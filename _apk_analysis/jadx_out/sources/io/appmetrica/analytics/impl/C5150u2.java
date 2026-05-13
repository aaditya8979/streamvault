package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5150u2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiConsumer f67766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f67767b;

    public C5150u2(O2 o22, ICommonExecutor iCommonExecutor) {
        this.f67766a = o22;
        this.f67767b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f67767b.execute(new RunnableC5125t2(this, context, intent));
    }
}
