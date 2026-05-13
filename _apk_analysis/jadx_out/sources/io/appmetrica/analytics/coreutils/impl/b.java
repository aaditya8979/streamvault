package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f64700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f64701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i10) {
        super(0);
        this.f64699a = context;
        this.f64700b = str;
        this.f64701c = i10;
    }

    @Override // sn.a
    public final Object invoke() {
        return this.f64699a.getPackageManager().getApplicationInfo(this.f64700b, this.f64701c);
    }
}
