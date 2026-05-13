package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f64697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f64698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i10) {
        super(0);
        this.f64696a = context;
        this.f64697b = componentName;
        this.f64698c = i10;
    }

    @Override // sn.a
    public final Object invoke() {
        return this.f64696a.getPackageManager().getActivityInfo(this.f64697b, this.f64698c);
    }
}
