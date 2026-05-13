package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import bn.r;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f64723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f64724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i10, int i11) {
        super(0);
        this.f64722a = context;
        this.f64723b = componentName;
        this.f64724c = i10;
        this.f64725d = i11;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f64722a.getPackageManager().setComponentEnabledSetting(this.f64723b, this.f64724c, this.f64725d);
        return r.f5635a;
    }
}
