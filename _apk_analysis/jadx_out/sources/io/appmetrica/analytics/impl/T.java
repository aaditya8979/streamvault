package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class T extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f65898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hi f65899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u10, Hi hi2) {
        super(0);
        this.f65898a = u10;
        this.f65899b = hi2;
    }

    @Override // sn.a
    public final Object invoke() {
        U u10 = this.f65898a;
        N n10 = u10.f65963h;
        Context context = u10.f65956a;
        Hi hi2 = this.f65899b;
        n10.getClass();
        return N.a(new M(n10, context, hi2));
    }
}
