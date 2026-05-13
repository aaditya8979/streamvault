package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class Q extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f65776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u10) {
        super(0);
        this.f65776a = u10;
    }

    @Override // sn.a
    public final Object invoke() {
        U u10 = this.f65776a;
        N n10 = u10.f65961f;
        Context context = u10.f65956a;
        n10.getClass();
        return N.a(new L(n10, context));
    }
}
